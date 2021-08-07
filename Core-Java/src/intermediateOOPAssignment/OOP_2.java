package intermediateOOPAssignment;

abstract class Employee{
	int salary=10000;
	abstract int getSalary();
}

class Manager extends Employee{
	int incentive=5000;

	int getSalary() {
		 return salary+incentive;
	}
}

class Labour extends Employee{
	int overTime=3000;

	int getSalary() {
		return salary+overTime;
	}
}

public class OOP_2 {

	public static void main(String[] args) {
		Employee mg= new Manager();
		Employee lb= new Labour();
		int total=mg.getSalary()+lb.getSalary();
		System.out.println("The total salary of all employees is: "+total);
	}

}
