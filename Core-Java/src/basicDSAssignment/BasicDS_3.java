package basicDSAssignment;
import java.util.*;
public class BasicDS_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal amount to calculate S.I and C.I for interest of 10% over 5 years");
		int p= sc.nextInt();
		int r=10, t=5;
		float si;
		double ci;
		si=(p*t*r)/100;
		ci= p*Math.pow(1+(r/100.0), t);
		System.out.println("Simple Interest: "+si);
		System.out.printf("Compound Interest: %.3f", ci);
		sc.close();
	}
}
