package Inheritance;

public class TestFile {
    public static void main(String[] args) {
        System.out.println("Hello User!");
        Programmer programmer = new Programmer();
        System.out.println("Bonus of Programmer: " + programmer.bonus);

        new ConstOverload(2000);
        System.out.println("Interest of Programmer: " + ConstOverload.interest);
    }
}
