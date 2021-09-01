package mvc.quest12;

public interface BankAccountService {
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId) throws AccountNotFoundException;
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalanceException, AccountNotFoundException;
}
