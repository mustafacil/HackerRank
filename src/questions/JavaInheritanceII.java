package questions;

public class JavaInheritanceII {

	public static void main(String[] args) {
		
		Adder a = new Adder();
		System.out.println(a.getClass().getSuperclass().getName());
		System.out.println(a.add(10, 32) + " "+ a.add(10, 3) + " " + a.add(10, 10) + "\n");
		
	}
	
	
}

class Arithmetic{
	
	public int add(int a, int b){
		
		return a+b;
		
	}
	
}

class Adder extends Arithmetic{
	
}