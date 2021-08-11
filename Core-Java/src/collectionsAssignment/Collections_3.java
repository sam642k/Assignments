package collectionsAssignment;
import java.util.*;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String dept;
	private int salary;
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		int ret= this.id-e.id;
		if(ret==0) {
			ret= this.name.compareTo(e.name);
		}
		if(ret==0)
			ret= this.dept.compareTo(e.dept);
		if(ret==0)
			ret= this.salary-e.salary;
		return ret;
	}
}

class IdComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
	
}

class NameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int ret= e1.getName().compareTo(e2.getName());
		if(ret==0)
			ret= e1.getId()-e2.getId();
		return ret;
	}
	
}

class DeptComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int ret= e1.getDept().compareTo(e2.getDept());
		if(ret==0)
			ret= e1.getId()-e2.getId();
		return ret;
	}
	
}

class SalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int ret= e1.getSalary()-e2.getSalary();
		if(ret==0)
			ret= e1.getId()-e2.getId();
		return ret;
	}
	
}

public class Collections_3 {

	public static void main(String[] args) {
		Set<Employee> set;
		Scanner sc= new Scanner(System.in);
		System.out.println("a) ID\tb) Name\tc) Department\td) Salary");
		String c= sc.next();
		
		if(c.compareTo("a")==0)
			set= new TreeSet<>(new IdComparator());
		else if(c.compareTo("b")==0)
			set= new TreeSet<>(new NameComparator());
		else if(c.compareTo("c")==0)
			set= new TreeSet<>(new DeptComparator());
		else if(c.compareTo("d")==0)
			set= new TreeSet<>(new SalaryComparator());
		else {
			System.out.println("Invalid Option!! Creating default set\n");
			set= new TreeSet<>();
		}
		
		set.add(new Employee(121, "Tony", "Weapons", 2000000));
		set.add(new Employee(54, "Steve", "Military", 4500000));
		set.add(new Employee(26, "Thor", "GOD", 10000000));
		set.add(new Employee(36, "Natasha", "Spy", 3800000));
		set.add(new Employee(46, "Bruce", "Weapons", 4500000));
		set.add(new Employee(32, "Clint", "Spy", 6500000));
		set.add(new Employee(81, "Bucky", "Military", 7800000));
		set.add(new Employee(16, "Sam", "Military", 2150000));
		set.add(new Employee(46, "Peter", "Assualt", 3540000));
		set.add(new Employee(46, "Wanda", "Assault", 6800000));
		
		for(Employee e: set)
			System.out.println(e);
		sc.close();
	}

}
