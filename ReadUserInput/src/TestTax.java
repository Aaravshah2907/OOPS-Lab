import java.io.*;
public class TestTax {

	private static boolean isPANSubmitted;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxOnSalary tax1 = new TaxOnSalary();
		TaxOnSalary tax2 = new TaxOnSalary(isPANSubmitted = true);
		tax1.inputSalary();
		tax2.inputSalary();
		
		System.out.println("For TAX1: ");
		System.out.printf("\tSalary: %.2f\n\tPAN submission status: %b\n\tCalculated Tax :%.3f", tax1.getSalary(), tax1.isPANSubmitted(), tax1.calculateTax());
		System.out.println("\n");
		

		System.out.println("For TAX2: ");
		System.out.printf("\tSalary: %.2f\n\tPAN submission status: %b\n\tCalculated Tax :%.3f", tax2.getSalary(), tax2.isPANSubmitted(), tax2.calculateTax());
		System.out.println(" ");
		
	}

}
