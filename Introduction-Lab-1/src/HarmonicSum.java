import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Max Denominator : ");
        int maxDenominator = Integer.parseInt(input.nextLine());
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += 1.0/ denominator;
        }
        System.out.println("Sum from L2R : "+sumL2R);
        for(int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += 1.0/ denominator;
        }
        System.out.println("Sum from R2L : "+sumR2L);
        System.out.println("Difference between them : "+(sumL2R-sumR2L));

    }
}
