package collectionsAssignment;
import java.util.*;

class Contact{
	private String name;
	private long phoneNo;
	private String email;
	private String gender;
	
	public Contact(String name, long phoneNo, String email, String gender) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender= gender;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", gender=" + gender + "]";
	}
}

public class Collections_1 {

	public static void main(String[] args) {
		Map<Long, Contact> map= new TreeMap<>(Collections.reverseOrder());
		map.put(9963868705L, new Contact("Tony", 9963868705L, "tony@avengers.com","Male"));
		map.put(8491567705L, new Contact("Steve", 8491567705L, "steve@avengers.com","Male"));
		map.put(9876548705L, new Contact("Thor", 9876548705L, "thor@avengers.com","Male"));
		map.put(7454464864L, new Contact("Natasha", 7454464864L, "natasha@avengers.com","Female"));
		
		for(Map.Entry<Long, Contact> e: map.entrySet())
			System.out.println(e.getKey()+"\t"+e.getValue());
	}

}
