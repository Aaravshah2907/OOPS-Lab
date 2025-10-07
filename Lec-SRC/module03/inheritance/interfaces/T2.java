package module03.inheritance.interfaces;

public interface T2 extends T1{

    //String getString();
    default String getString() {
        return "Default T2";
    }
}

