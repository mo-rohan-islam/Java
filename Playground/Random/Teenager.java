import java.util.ArrayList;
import java.util.List;

public class Teenager {
    public static void main(String[] args) {
        // write a program to fetch teenager customers from list of customers

        List<Customer> listOfCustomers = new ArrayList<>();
        listOfCustomers.add(new Customer(12, "Rohan"));
        listOfCustomers.add(new Customer(13, "Sohan"));
        listOfCustomers.add(new Customer(20, "Mohan"));
        listOfCustomers.add(new Customer(19, "Sriti"));
        listOfCustomers.add(new Customer(15, "Shrusti"));

        listOfCustomers.stream()
                .filter(customer -> customer.getAge() >= 13 && customer.getAge() <= 19)
                .forEach(System.out::println);

        System.out.println();

        // List<String> adultNames = listOfCustomers.stream()
        listOfCustomers.stream()
                // .sorted(Comparator.comparingInt(Customer::getAge).reversed())
                .filter(customer -> customer.getAge() >= 18)
                .forEach(System.out::println);
        // .map(Customer::getName).toList();
        // System.out.println(adultNames);
    }
}

class Customer {
    int age;
    String name;

    @Override
    public String toString() {
        return "Customer [age=" + age + ", name=" + name + "]";
    }

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
