package module02.today26082025;

class MixBlocks {
    static { System.out.println("Static Block 1"); }
    { System.out.println("Instance Block 1"); }
    static { System.out.println("Static Block 2"); }
    { System.out.println("Instance Block 2"); }
    MixBlocks() { System.out.println("Constructor"); }

    public static void main(String[] args) {
        System.out.println("Main starts");
        new MixBlocks();
        System.out.println("---");
        new MixBlocks();
    }
}
