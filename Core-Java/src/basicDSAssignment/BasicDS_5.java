package basicDSAssignment;
import java.util.*;
public class BasicDS_5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter salary in CTC: ");
		int sal= sc.nextInt();
		System.out.print("Tax to be paid: ");
		if(sal>=0 && sal<=180000) {
			System.out.println("Nil");
		}
		else if(sal>=180001 && sal<=300000) {
			System.out.println(sal*0.1);
		}
		else if(sal>=300001 && sal<=500000) {
			System.out.println(sal*0.2);
		}
		else if(sal>500000 && sal<=1000000) {
			System.out.println(sal*0.3);
		}
		sc.close();
	}

}
