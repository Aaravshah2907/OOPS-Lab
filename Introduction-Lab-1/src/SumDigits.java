public class SumDigits {
    public static void main(String[] args) {
        String number = args[0];
        int sum = 0;
        int[] digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(number.charAt(i) + "");
            sum += digit;
            digits[i] = digit;
        }
        System.out.print("The sum of digits = ");
        for (int i = 0; i < digits.length; i++) {
            if (i != (digits.length - 1)) {
                System.out.print(digits[i] + " + ");
            }
            else {
                System.out.print(digits[i] + " = ");
            }
        }
        System.out.println(sum);

    }
}
