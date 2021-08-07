package intermediateOOPAssignment;

class Test1{
	abstract void method();//Error: class must be declared abstract if method is abstract
}

final abstract class Test2{// Error: Classes can be final or abstract but not both
	
}

abstract class Test3{
	abstract void test3();
}

private abstract class test4{// Error: private modifier not permitted
	
}

abstract class test5{// Class can be abstract without any abstract methods
	void meethod() {}
}

public class OOP_4 extends Test3{ // Error: Abstract methods need to be overriden if abstract class Test3 is extended
	public static void main(String[] args) {
		Test2 ob= new Test2();// Error: Abstract class cannot be instantiated
	}
}
