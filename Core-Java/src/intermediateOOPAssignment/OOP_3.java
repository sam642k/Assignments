package intermediateOOPAssignment;

abstract class Bank{
	abstract int getBalance();
}

class Savings extends Bank{
	int fixedDeposit=15000;
	int getBalance() {
		return fixedDeposit;
	}
}

class Current extends Bank{
	int creditCash=18000;
	int getBalance() {
		return creditCash;
	}
}

public class OOP_3 {

	public static void main(String[] args) {
		Bank sv= new Savings();
		Bank cr= new Current();
		System.out.println("Total Cash in Bank is: "+(sv.getBalance()+cr.getBalance()));
	}

}
