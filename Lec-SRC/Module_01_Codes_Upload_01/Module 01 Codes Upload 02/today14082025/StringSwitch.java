package module01.today14082025;

public class StringSwitch {

    public static void main(String[] args) {

        String str = "two";

        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}

/* expression must resolve to type byte,
short,int,char,an enumeration { JDK 7 onwards}  or a String (JDK 10 onwards) */