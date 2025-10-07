package module03.inheritance.asbtract;

public abstract class TestAbstract {

    static final int xyz = 78;
    private final int abc = 78;

    public static void doPrint() {
        System.out.println("jjj");
    }

    public final int  doComputation(){
        int random = (int) Math.random();
        return random;
    }

    public abstract void generatePrime();

}
