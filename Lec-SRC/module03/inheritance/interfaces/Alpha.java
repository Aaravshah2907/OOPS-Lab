package module03.inheritance.interfaces;

public interface Alpha {
    default public void reset(){
        System.out.println("Alpha Interface");
    }
}
