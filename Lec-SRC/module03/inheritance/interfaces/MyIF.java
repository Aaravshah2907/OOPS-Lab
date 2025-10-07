package module03.inheritance.interfaces;

public interface MyIF {

    //int getNumber();

    default String getString() {
        return "Default String";
    }
}
