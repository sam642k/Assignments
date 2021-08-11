package lambdaAssignments;

import java.util.*;
import java.util.function.*;

public class Lambda_7 {
	
	static void stringFromMap(Map<Integer, String> map, Consumer<String> c) {
		for(Map.Entry<Integer, String> e: map.entrySet())
			c.accept(e.getKey()+": "+e.getValue()+" ");
	}
	
	public static void main(String[] args) {
		Map<Integer, String> map= new TreeMap<>();
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(5, "FIVE");
		
		StringBuilder sb= new StringBuilder();
		stringFromMap(map, s -> sb.append(s));
		System.out.println(sb);
	}
}
