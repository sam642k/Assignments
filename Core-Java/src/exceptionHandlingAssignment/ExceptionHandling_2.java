package exceptionHandlingAssignment;

import java.util.Scanner;

public class ExceptionHandling_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Numbers for division");
		int a=sc.nextInt(), b=sc.nextInt();
		try {
			int result=a/b;
			System.out.println("the result is: "+result);

		}
		catch(ArithmeticException ae){
			throw new UnsupportedOperationException("Divisor cannot be zero !!");
		}
		finally {
			sc.close();
		}
	}

}
