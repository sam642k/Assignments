package basicDSAssignment;
import java.util.*;

public class BasicDS_1 {
	boolean isAmstrong(int n) {
		int r, s=0, x=n;
		while(n>0) {
			r=n%10;
			s+=(r*r*r);
			n/=10;
		}
		if(s==x)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BasicDS_1 ob= new BasicDS_1();
		int n= sc.nextInt();
		if(ob.isAmstrong(n)) {
			System.out.println(n+" is an amstrong number");
		}
		else
			System.out.println(n+" is not an amstrong number");
		sc.close();
	}

}
