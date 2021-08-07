package basicDSAssignment;
import java.util.*;
public class BasicDS_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m1= sc.nextInt(), m2=sc.nextInt(), m3=sc.nextInt();
		if(m1>60 && m2>60 && m3>60)
			System.out.println("Passed");
		else if((m1>60 && m2>60) || (m1>60 && m3>60) || (m2>60 && m3>60))
			System.out.println("Promoted");
		else
			System.out.println("Failed");
		sc.close();
	}

}
