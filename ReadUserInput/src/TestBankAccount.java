import java.util.Scanner;

class BankAccount{
	private String accountNumber, accountHolderName;
	private double balance;
	
	BankAccount(String accNo, String accname, double bal){
		this.accountNumber = accNo;
		this.accountHolderName = accname;
		this.balance = bal;
	}

	BankAccount(String accNo, String accname){
		this.accountNumber = accNo;
		this.accountHolderName = accname;
		this.balance = 0.0;
	}
	
	public String getAccountNumber(){
		return this.accountNumber;
	}
	
	public String getAccountHolderName(){
		return this.accountHolderName;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void deposit(double amount){
		if (amount >= 0){
			this.balance += amount;
			System.out.printf("Balance Updated to %d\n", this.balance);
		}
		else{
			System.out.println("Negative Value");
		}
	}
	
	public void withdraw(double amount){
		if (amount <= this.balance){
			this.balance -= amount;
			System.out.printf("Balance Updated to %d\n", this.balance);
		}
		else{
			System.out.println("You can't withdraw more money than you are worth!!");
		}
	}
	
	public void displaydetails(){
		String balstr = this.balance + "";
		System.out.println("\n\nAccount Detaile:\n\tAccount Number: "+this.accountNumber+"\n\tAccount Name Holder: "+ this.accountHolderName + "\n\tBalance: "+balstr);
	}
}


public class TestBankAccount {

	private static String accountNumber;
	private static String accountHolderName;
	private static double balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details for Account 1: ");
		System.out.print("\tEnter Account Number: ");
		String accnum1 = sc.nextLine();
		System.out.print("\tEnter Account Holder Name: ");
		String accname1 = sc.nextLine();
		System.out.print("\tEnter Account Balance: ");
		double accbal1 = sc.nextDouble();
		String blank = sc.nextLine();
		
		
		System.out.println("Enter Details for Account 2: ");
		System.out.print("\tEnter Account Number: ");
		String accnum2 = sc.nextLine();
		System.out.print("\tEnter Account Holder Name: ");
		String accname2 = sc.nextLine();
		System.out.print("\tEnter Account Balance: ");
		double accbal2 = sc.nextDouble();
		
		BankAccount Account1 = new BankAccount(accountNumber = accnum1, accountHolderName = accname1, balance = accbal1);
		BankAccount Account2 = new BankAccount(accountNumber = accnum2, accountHolderName = accname2, balance = accbal2);
		
		Account1.displaydetails();
		Account2.displaydetails();
		
	}

}
