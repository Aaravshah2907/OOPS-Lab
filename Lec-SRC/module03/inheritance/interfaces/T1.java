package module03.inheritance.interfaces;

public interface T1 {
    //int getNumber();

    default String getString() {
        return "Default T1";
    }
}
