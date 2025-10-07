package module02.today26082025;

class InitBlocks {
    { System.out.println("Instance Block 1"); }
    { System.out.println("Instance Block 2"); }

    InitBlocks() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new InitBlocks();
        System.out.println("----");
        new InitBlocks();
    }
}

