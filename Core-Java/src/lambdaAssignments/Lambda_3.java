package lambdaAssignments;
import java.util.function.*;

public class Lambda_3 {
	
	static void supplier(Supplier<String> s) {
		System.out.println("Hello from "+s.get());
	}
	
	static void consumer(Consumer<String> c) {
		c.accept("Hello from Consumer");
	}
	
	static void predicate(Predicate<String> p) {
		if(p.test("predicate"))
			System.out.println("Hello from Predicate");
	}
	
	static void function(Function<String, String> f) {
		System.out.println(f.apply("Hello from "));
	}
	
	public static void main(String[] args) {
		supplier(() -> "Suplier");
		consumer(s -> System.out.println(s));
		predicate(str -> str.compareTo("predicate")==0);
		function(s -> s+"Function");
	}

}
