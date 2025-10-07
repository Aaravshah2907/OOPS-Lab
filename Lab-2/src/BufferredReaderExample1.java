import java.io.*;

class BufferredReaderExample1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.print("Enter a string: ");
        line = br.readLine();
        String[] words = line.split(" ");
        for(String word : words) {
            System.out.print(word+"--");
        }
        System.out.println();
    }
}
