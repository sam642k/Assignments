package intermediateOOPAssignment;

class Singleton{
	private static Singleton inst= null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(inst==null)
			inst= new Singleton();
		return inst;
	}
	public void message() {
		System.out.println("From Sigleton class");
	}
}

public class OOP_1 extends Singleton{
	public static void main(String[] args) {
		OOP_1 a= new OOP_1();
		a.message();
	}
}
