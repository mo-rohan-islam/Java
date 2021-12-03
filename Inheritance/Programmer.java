package Inheritance;

class Employee {
    float salary = 40000;
}

/**
 * Programmer
 */
public class Programmer extends Employee {
    public int bonus = 10000;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Salary is " + p.salary);
        System.out.println("Bonus of Programmer is " + p.bonus);
    }  
}