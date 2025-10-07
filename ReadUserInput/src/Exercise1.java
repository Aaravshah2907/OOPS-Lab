import java.io.*;
public class Exercise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sum = 0;
		for (int i = 0; i < 10; i++){
			System.out.print("Enter Number: ");
			String num = br.readLine();
			int number = Integer.parseInt(num);
			sum += number;
		}
		System.out.printf("Sum: %d", sum );
		
	}

}
