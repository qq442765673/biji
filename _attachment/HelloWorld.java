package HelloWorld;

public class HelloWorld {
	int Dogage;
	public HelloWorld(String name) {
		
	}
	
	public void setAge(int age) {
		Dogage=age;
	}
	public void getAge() {
		System.out.print("Dog's age is:"+Dogage);
	}
    public static void main(String []args) {
    	float floatVar=0;
    	int intVar=0;
    	String stringVar="giao";
    	System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", floatVar, intVar, stringVar);
    	String fs;
    	fs = String.format("浮点型变量的值为 " +
    	                   "%f, 整型变量的值为 " +
    	                   " %d, 字符串变量的值为 " +
    	                   " %s", floatVar, intVar, stringVar);
    	System.out.printf(fs);
    }
}