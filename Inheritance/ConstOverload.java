package Inheritance;

public class ConstOverload {
    public static int interest;
    ConstOverload() {
        interest = 1000;
        System.out.println("Inside No Arg Constructor of ConstOverload");
    }

    public ConstOverload(int interest) {
        ConstOverload.interest = interest;
        System.out.println("Inside single arg constructor of ConstOverload");
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.bonus = 20000;
        programmer.salary = 60000;

        new ConstOverload(5000);
        System.out.println("Salary: " + programmer.salary);
        System.out.println("Bonus: " + programmer.bonus);
        System.out.println("Interest: " + interest);

        new ConstOverload();
        System.out.println("Salary: " + programmer.salary);
        System.out.println("Bonus: " + programmer.bonus);
        System.out.println("Interest: " + interest);
        
    }
}