package basicDSAssignment;
import java.util.*;
public class BasicDS_6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=3;
		String name="sam642k", passw="asdfg", userId, password ;
		while(n>0) {
			System.out.println("Enter User-Id: ");
			userId= sc.nextLine();
			System.out.println("Enter Password: ");
			password= sc.nextLine();
			if(userId.compareTo(name)==0 && password.compareTo(passw)==0) {
				System.out.println("Welcome "+userId);
				break;
			}
			else {
				System.out.println("Incorrect details! \n Attempts left: "+(n-1));
				n--;
			}
		}
		sc.close();
	}

}
