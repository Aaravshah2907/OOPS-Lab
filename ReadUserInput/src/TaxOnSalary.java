import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TaxOnSalary {
	Scanner sc = new Scanner(System.in);
	
	private double salary;
	private boolean isPANSubmitted;
	
	public TaxOnSalary() {
		this.salary = 0.0;
		this.isPANSubmitted = false;
	}

	public TaxOnSalary(boolean isPANSubmitted) {
		this.salary = 1000.0;
		this.isPANSubmitted = isPANSubmitted;
	}


	public double getSalary() {
		return salary;
	}


	public boolean isPANSubmitted() {
		return isPANSubmitted;
	}
	
	public void inputSalary() {
		this.salary = sc.nextDouble();
	}
	
	public double calculateTax(){
		double tax = 0.0;
		double sal = this.salary;
		boolean PAN = this.isPANSubmitted;
		if ((sal < 180000) && (PAN)){
			tax = 0;
		}
		else if ((sal < 180000) && !(PAN)){
			tax = 0.05;
		}
		else if (sal < 500000){
			tax = 0.1;
		}
		else if (sal < 1000000){
			tax = 0.2;
		}
		else {
			tax = 0.3;
		}
		return tax*sal;
	}
	

}
