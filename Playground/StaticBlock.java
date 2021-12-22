/**
 * test2
 */
class test2 {
    static {
        System.out.println("Inside test2 static block");
    }

    static void display() {
        System.out.println("Inside test2 display block");
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
        test2.display();
        display();
    }
}
