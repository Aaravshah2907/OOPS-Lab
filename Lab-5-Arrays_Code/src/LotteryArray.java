public class LotteryArray {
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i<= n; i++) fact *=i;
		return fact;
		
	}
	public static void main(String[] args) {
		
		final int NMAX = 12; //12 max
		int []factorial_array = new int[NMAX+1];
		int[][] odds = new int[NMAX + 1][];
		int n;
		
		// TODO: initialise the nth row of odds to an array of (n+1) elements
		for (n = 0; n <= NMAX; n++) odds[n] = new int[n+1];
		for (n = 0; n < NMAX + 1; n++) factorial_array[n] = factorial(n);
		
		for (n = 0; n < odds.length; n++) {
			for (int k = 0; k < odds[n].length; k++) {
				/*
				 * TODO: Compute binomial coefficient: n*(n-1)*(n-2)...*(n-k+1)/(1*2*3*...*k)
				 * and store in the kth element of the nth row
				 */
				odds[n][k] = factorial_array[n]/(factorial_array[k]*factorial_array[n-k]);
				System.out.print(odds[n][k] + "\t");
			}
		System.out.println();
		}
		
		// TODO: Print triangular array odds
		
		
		
	}
}
