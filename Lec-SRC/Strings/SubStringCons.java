package module02.today29082025;

public class SubStringCons {

    public static void main(String[] args) {
        byte ascii[] = { 65, 66, 67, 68, 69, 70 };

        String s1 = new String(ascii);
        System.out.println(s1);

        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);
        System.out.println("bob".substring (1));
        System.out.println("Tanmay".indexOf ("C"));
        System.out.println("Tanmay".indexOf ("a"));
        System.out.println("Tanmay".lastIndexOf("a"));

        String word1 = "re";
        String word2 = "think";
        String word3 = "ing";
        String result = word1 + word2;
        String r3 = "rethink";
        System.out.println(r3==result);
        int num = 2;


    }
}