package lambdaAssignments;

import java.util.Arrays;
import java.util.List;

public class Mythread extends Thread{

	public void run() {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
		Lambda_8.print(list, i -> System.out.println(i));
	}

}
