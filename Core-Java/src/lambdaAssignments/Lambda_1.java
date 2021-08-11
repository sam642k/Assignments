package lambdaAssignments;

@FunctionalInterface
interface Lam{
	void arithmeticOp(int a, int b);
}

public class Lambda_1 {
	public static void main(String[] args) {
		Lam add= (a, b) -> System.out.println("Addition Result: "+(a+b));
		Lam sub= (a, b) -> System.out.println("Subtraction Result: "+(a-b));
		Lam mul= (a, b) -> System.out.println("Multiplication Result: "+(a*b));
		Lam div= (a, b) -> {
			if(b==0)
				System.out.println("Devision Result: 0");
			System.out.println("Devision Result: "+(a/b));
		};
		
		add.arithmeticOp(5, 2);
		sub.arithmeticOp(5, 2);
		mul.arithmeticOp(5, 2);
		div.arithmeticOp(5, 2);
	}
}
