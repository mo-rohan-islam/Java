// package Playground;

/**
 * Test
 */
class Test {
    static {
        System.out.println("Inside Test static block");
    }

    static void display() {
        System.out.println("Inside Test display block");
    }
}

public class StaticBlock {

    static {
        System.out.println("Inside main Static Block");
    }

    static void display() {
        System.out.println("Inside main display block");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        Test.display();
        display();
    }
}
