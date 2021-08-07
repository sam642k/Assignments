package basicDSAssignment;

import java.util.*;
public class BasicDS_7 {

	public static void main(String[] args) {
		int[] arr= new int[] {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47} ;
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt(), flag=0;
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				System.out.println(x+" was found at "+i+"th position");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(x+" was not found");
		sc.close();
	}

}
