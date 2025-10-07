public class CompoundInterest {
	public static void main(String[] args) {
		
		final double STARTRATE = 0.05;
		final int NRATES = 8;
		final int NYEARS = 10;
		
		double []interestRates = new double[NRATES];
		for(int j = 0; j < interestRates.length; j++) {
			interestRates[j] = STARTRATE * j;
		}
		
		double [][]balances = new double[NYEARS][NRATES];
		for(int j = 0; j < balances[0].length; j++) {
			balances[0][j] = 10000;
		}
		 
		for (int i = 1; i < NYEARS; i++) { 
			for (int j = 0; j < NRATES; j++) { 
				double interest = balances[i-1][j] * interestRates[j];
				balances[i][j] = balances[i-1][j] + interest;
			} 
		}

        for (double interestRate : interestRates) System.out.printf("%9.0f%%", 100 * interestRate);
		
		System.out.println(); 
		
		for (int i = 0; i < NYEARS; i++) { 
			for (int j = 0; j < NRATES; j++) { 
				System.out.print(balances[i][j] + "\t\t");
			} 
			System.out.println();
		}
	}
}
