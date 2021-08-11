package lambdaAssignments;

import java.util.*;

public class Lambda_4 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>(List.of("Predicate", "Supplier", "Interface", "Class", "Function"));
		System.out.println("Before removing: "+list);
		list.removeIf(x-> x.length()%2==1);
		System.out.println("After removing: "+list);
	}

}
