package stringAssignments;

public class String_3 {

	public static void main(String[] args) {
		String str= "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("\nLowercase: "+str.toLowerCase());
		System.out.println("\nUppercase: "+str.toUpperCase());
		System.out.println("\nReplacing all occurrence of 'a' with '$': "+str.replace('a', '$'));
		if(str.contains("collection"))
			System.out.println("\nThe string contains the word 'collection'");
		else
			System.out.println("\nThe string does not contain the word 'collection");
		if(str.compareTo("java string pool refers to collection of Strings which are stored in heap memory")==0)
			System.out.println("\nThe string matches the original");
		else if(str.equalsIgnoreCase("java string pool refers to collection of Strings which are stored in heap memory"))
			System.out.println("\nThe strings are equal when case is ignored");
		else
			System.out.println("\nThe strings are not equal");
	}

}
