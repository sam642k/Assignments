package stringAssignments;

public class StringBuilder_3 {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println("The reverse of '"+sb+"' is:");
		sb.reverse();
		System.out.println(sb);
	}

}
