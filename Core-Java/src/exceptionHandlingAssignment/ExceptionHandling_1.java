package exceptionHandlingAssignment;

import java.util.Scanner;

public class ExceptionHandling_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Numbers for division");
		int a=sc.nextInt(), b=sc.nextInt();
		try {
			int result=a/b;
			System.out.println("the result is: "+result);

		}
		catch(ArithmeticException ae){
			System.out.println("Divisor cannot be zero!");
			//ae.printStackTrace();
		}
		sc.close();
	}

}
