package lambdaAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda_5 {
	static void createString(List<String> list, Consumer<String> c) {
		for(String s: list)
			c.accept(s);
	}
	public static void main(String[] args) {
		List<String> list= new ArrayList<>(List.of("Predicate", "Supplier", "Interface", "Class", "Function"));
		StringBuilder sb= new StringBuilder();
		createString(list, s -> sb.append(s.charAt(0)));
		System.out.println(sb);
	}
}
