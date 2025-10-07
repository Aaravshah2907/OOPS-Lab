import java.io.*;

public class BufferredReaderSum {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0;
        String line;
        line = br.readLine();
        String[] Numbers = line.split(" ");
        for (String strNum : Numbers) {
            try {
                // 3. Convert (parse) the string to an integer and add it to the sum
                sum += Integer.parseInt(strNum.trim()); // .trim() removes accidental whitespace
            } catch (NumberFormatException e) {
                System.out.println("'" + strNum + "' is not a valid number. Skipping.");
            }
        }

        // 4. Print the final calculated sum
        System.out.println("The sum is: " + sum);
    }
}
