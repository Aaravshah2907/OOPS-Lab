public class BankAccount {
	private int AccountNumber;
	private double Balance;
	static String BankName = "Bank of India";
	static float InterestRate = 0.0f;
	static double TotalBankReserve;
	static int counter;
	
	BankAccount(double bal){
		this.AccountNumber = ++counter;
		this.Balance = bal;
		TotalBankReserve += bal;
	}
	
	private void Deposit(double value) {
		this.Balance += value;
		TotalBankReserve += value;
		InterestRate = CalculateInterestRate();
		System.out.println("New Interest Rate : "+InterestRate);
	}
	
	public float CalculateInterestRate() {
		int update_required = (int) (TotalBankReserve/1000);
		return (float) (update_required*0.1);
	}
	
	private void Withdraw(double value) {
		if (this.Balance >= value) {
			this.Balance -= value;
			TotalBankReserve -= value;
			InterestRate = CalculateInterestRate();
			System.out.println("New Interest Rate : "+InterestRate);
		}
		else {
			System.out.println("Insufficient Funds!!");
		}
	}
	
	private void DisplayUserInfo() {
		System.out.println("===============================================================");
		System.out.println("Account Number : \t\t\t" + this.AccountNumber);
		System.out.println("Account Balance:\t\t\t$" + this.Balance);
		System.out.println("===============================================================");
		System.out.println("");
	}
	
	public static void DisplayBankInfo() {
		System.out.println("===============================================================");
		System.out.println("Bank Name	:	 \t\t" + BankName);
		System.out.println("Bank Balance 	:\t\t\t$" + TotalBankReserve);
		System.out.println("Interest Rate	: \t\t\t" + InterestRate);
		System.out.println("Number of Users	: \t\t\t"+ counter);
		System.out.println("===============================================================");
		System.out.println("");
	}
	
	
	public static void main(String args[]) {
		BankAccount.DisplayBankInfo();
		System.out.println("");
		BankAccount Acc1 = new BankAccount(150000);
		System.out.println("");
		Acc1.DisplayUserInfo();
		System.out.println("");
		Acc1.Deposit(1000);
		System.out.println("");
		Acc1.DisplayUserInfo();
		System.out.println("");
		Acc1.Withdraw(15200000);
		System.out.println("");
		Acc1.Withdraw(1000);
		System.out.println("");
		Acc1.DisplayUserInfo();
		System.out.println("");
		BankAccount.DisplayBankInfo();
		System.out.println("");
	}
}
