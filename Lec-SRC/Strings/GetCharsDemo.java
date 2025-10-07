package module02.today29082025;

public class GetCharsDemo {
    public void compute (int a[]){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];

        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        char ch;
        ch = "abc".charAt(1);
        System.out.println(ch);
        int [][]demo = new int[10][10];
        int demo1[] = new int[5];
        new GetCharsDemo().compute(demo1);
    }
}