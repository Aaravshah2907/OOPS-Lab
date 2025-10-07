package module02.today26082025;

public class ConstructorBlockExample{
    {System.out.println("This is second constructor block");}
    { System.out.println("This is first constructor block"); }
    public ConstructorBlockExample(){
        //
        //
        System.out.println("This is no parameter constructor");
    }
    public ConstructorBlockExample(String param1){
        //
        //
        System.out.println("This is single parameter constructor" + param1);
    }

    public static void main(String[] args){
        ConstructorBlockExample constrBlockEx =
                new ConstructorBlockExample();
        ConstructorBlockExample constrBlockEx1 =
                new ConstructorBlockExample("param1");
    }
}