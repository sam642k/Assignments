package genericsAssignment;
import java.util.*;

public class Generics_2 {

	public static void main(String[] args) {
		Map<Integer, Double> map= new HashMap<>();
		map.put(1,32323.33);
		map.put(4,453453.4433);
		map.put(8,6875645.5433);
		map.put(15,5854.3453);
		map.put(65,7115156.15);
		map.put(84,21323.6546);
		map.put(25,5423.64);
		map.put(37,6553.888);
		map.put(19,9823.998);
		map.put(41,584.848);
		System.out.println(map);
		for(Map.Entry<Integer, Double> e: map.entrySet())
			System.out.println(e.getKey()+"   "+e.getValue());
	}

}
 