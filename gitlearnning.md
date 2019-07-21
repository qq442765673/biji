#git 学习之路

##创造版本库
在文件夹里 git init 即可将当前文件夹创为一个仓库
##恢复git数据
git log 显示最近到最远的提交日志
首先，Git必须知道当前版本是哪个版本，在Git中，用HEAD表示当前版本，，上一个版本就是HEAD^，上上一个版本就是HEAD^^，当然往上100个版本写100个^比较容易数不过来，所以写成HEAD~100。

git reset --hard HEAD^

也可以

git reset --hard +commit id  就是从 git log里看到的前五位

###如果想恢复到之前的的情况
Git提供了一个命令git reflog用来记录你的每一次命令
可以得到commit id 然后 git reset即可

###恢复误删文件，从版本库
git checkout其实是用版本库里的版本替换工作区的版本，无论工作区是修改还是删除，都可以“一键还原”。

##上传远程库
要关联一个远程库，使用命令git remote add origin git@server-name:path/repo-name.git；
 https类型的格式为： $ git remote add origin https://github.com/daoke0818/testGit2.git

关联后，使用命令git push -u origin master第一次推送master分支的所有内容；

此后，每次本地提交后，只要有必要，就可以使用命令git push origin master推送最新修改；


##从远程库克隆
直接git clone <http>

##创建和合并分支
Git鼓励大量使用分支：

查看分支：git branch

创建分支：git branch <name>

切换分支：git checkout <name>

创建+切换分支：git checkout -b <name>

合并某分支到当前分支：git merge <name>

删除分支：git branch -d <name>

##储存工作现场
git stash然后切换分支   记得用git status查看工作区

##合并分支并删除原有分支
首先确定要在哪个分支上修复bug，假定需要在master分支上修复，就从master创建临时分支：
$ git merge --no-ff -m "merged bug fix 101" issue-101  相当一个commit引号是注释  末尾是分支名，运行后，分支消失，分支信息合并到主枝

##恢复工作分区
工作区是干净的，刚才的工作现场存到哪去了？用git stash list命令看看：
工作现场还在，Git把stash内容存在某个地方了，但是需要恢复一下，有两个办法：

一是用git stash apply恢复，但是恢复后，stash内容并不删除，你需要用git stash drop来删除；

另一种方式是用git stash pop，恢复的同时把stash内容也删了：

##多人协作
从远程库克隆时，是把本地库和远程库相连，查看远程库信息用git remote
或者用git remote -v看详细信息
因此，多人协作的工作模式通常是这样：

首先，可以试图用git push origin <branch-name>推送自己的修改；

如果推送失败，则因为远程分支比你的本地更新，需要先用git pull试图合并；

如果合并有冲突，则解决冲突，并在本地提交；

没有冲突或者解决掉冲突后，再用git push origin <branch-name>推送就能成功！

如果git pull提示no tracking information，则说明本地分支和远程分支的链接关系没有创建，用命令git branch --set-upstream-to <branch-name> origin/<branch-name>。

这就是多人协作的工作模式，一旦熟悉了，就非常简单。

小结
查看远程库信息，使用git remote -v；

本地新建的分支如果不推送到远程，对其他人就是不可见的；

从本地推送分支，使用git push origin branch-name，如果推送失败，先用git pull抓取远程的新提交；

在本地创建和远程分支对应的分支，使用git checkout -b branch-name origin/branch-name，本地和远程分支的名称最好一致；

建立本地分支和远程分支的关联，使用git branch --set-upstream branch-name origin/branch-name；

从远程抓取分支，使用git pull，如果有冲突，要先处理冲突。

##打标签
然后，敲命令git tag <name>就可以打一个新标签：
git tag 显示标签    标签是打在最新提交的commit 上的

###如果想把给之前的打标签
git log --pretty=oneline --abbrev-commit 找出id
后git tag <标签> ID
可以用git show <tagname>查看标签信息
git tag -d v0.1  删除标签