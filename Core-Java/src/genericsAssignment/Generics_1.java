package genericsAssignment;
import java.util.*;

class Employee{
	int id;
	String name;
	long salary;
	String department;
	
	public Employee(int id, String name, long salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	void displayDetails(){
		System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary+" Department: "+department);
	}
}

public class Generics_1 {

	public static void main(String[] args) {
		Set<Employee> set= new HashSet<>();
		set.add(new Employee(1,"Tony", 6000000,"AI"));
		set.add(new Employee(1,"Steve", 2000000,"Military"));
		set.add(new Employee(1,"Thor", 3600000,"God"));
		
		//set.add(new String("Cannot Add other than Employee"));
		
		Iterator<Employee> i= set.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	
	}

}
