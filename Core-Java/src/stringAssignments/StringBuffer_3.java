package stringAssignments;

public class StringBuffer_3 {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("The reverse of '"+sb+"' is:");
		sb.reverse();
		System.out.println(sb);
	}

}
