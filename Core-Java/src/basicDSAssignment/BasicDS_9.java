package basicDSAssignment;

import java.util.Scanner;

public class BasicDS_9 {
	int m1, m2, m3;
	void total() {
		System.out.println("The total marks are: "+(m1+m2+m3));
	}
	void avg() {
		System.out.println("The average score is: "+((m1+m2+m3)/3));
	}
	void acceptMarks() {
		System.out.print("Enter Marks: ");
		Scanner sc= new Scanner(System.in);
		m1= sc.nextInt();
		m2= sc.nextInt();
		m3= sc.nextInt();
	}
	public static void main(String[] args) {
		BasicDS_9 A= new BasicDS_9();
		BasicDS_9 B= new BasicDS_9();
		BasicDS_9 C= new BasicDS_9();
		System.out.println("Student A");
		A.acceptMarks();
		A.total();
		A.avg();
		System.out.println("Student B");
		B.acceptMarks();
		B.total();
		B.avg();
		System.out.println("Student C");
		C.acceptMarks();
		C.total();
		C.avg();
	}
}
