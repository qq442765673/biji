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
    	System.out.printf("�����ͱ�����ֵΪ " +
                "%f, ���ͱ�����ֵΪ " +
                " %d, �ַ���������ֵΪ " +
                "is %s", floatVar, intVar, stringVar);
    	String fs;
    	fs = String.format("�����ͱ�����ֵΪ " +
    	                   "%f, ���ͱ�����ֵΪ " +
    	                   " %d, �ַ���������ֵΪ " +
    	                   " %s", floatVar, intVar, stringVar);
    	System.out.printf(fs);
    }
}