package exceptionHandlingAssignment;

class InsufficientBalanceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

class IllegalBankTransactionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

class SavingAccount{
	long id=1;
	double balance=10000;
	
	double withdraw(double amount) {
		if(balance<amount){
			throw new InsufficientBalanceException();
		}
		else if(amount<0) {
			throw new IllegalBankTransactionException();
		}
		else {
			balance-=amount;
		}
		return balance;
	}
	
	double deposit(double amount) {
		balance+=amount;
		return balance;
	}
}

public class ExceptionHandling_3 {

	public static void main(String[] args) {
		SavingAccount sa= new SavingAccount();
		
		try {
			System.out.println("! Depositing 1000 in account !\n Balance is: "+sa.deposit(1000));
			System.out.println("! Withdrawing 3000 in account !\n Balance is: "+sa.withdraw(3000));
			System.out.println("Withdrawing amount greater than balance amount");
			//sa.withdraw(500000);
			System.out.println("Withdrawing negative amount");
			sa.withdraw(-2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
