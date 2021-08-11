package lambdaAssignments;

import java.util.List;
import java.util.function.Consumer;

public class Lambda_8{
	
	static void print(List<Integer> list, Consumer<Integer> c) {
		for(Integer i: list)
			c.accept(i);
	}
	
	public static void main(String[] args) {
		Mythread t= new Mythread();
		t.start();
	}

}
