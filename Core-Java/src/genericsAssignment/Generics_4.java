package genericsAssignment;


class Pair<K, V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class Generics_4 {

	public static void main(String[] args) {
		Pair<String, String> p1= new Pair<>();
		Pair<String, java.util.Date> p2= new Pair<>();
		p1.setKey("1");
		p1.setValue("Hello");
		p2.setKey("Today is ");
		p2.setValue(new java.util.Date());
		System.out.println(p1.getKey()+" "+p1.getValue());
		System.out.println(p2.getKey()+" "+p2.getValue());
	}

}