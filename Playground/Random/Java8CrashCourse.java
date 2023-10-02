import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8CrashCourse {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        setupEmployeeList(employeeList);

        // employeeList.stream().forEach(System.out::println);

        getCountOfMaleFemale(employeeList);
        getDepartmentName(employeeList);
        getAverageAge(employeeList);
        getNameOfEmp(employeeList);
        countByDept(employeeList);
        avgSalary(employeeList);
        oldestEmp(employeeList);
        getEmpSalary(employeeList);
        listDownDept(employeeList);
    }

    public static void listDownDept(List<Employee> employeeList) {
        Map<String, List<Employee>> groupByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        for (Map.Entry<String, List<Employee>> entry : groupByDept.entrySet()) {
            System.out.println("--------------------------------------");
            System.out.println("Employees In " + entry.getKey());
            System.out.println("--------------------------------------");

            entry.getValue().forEach(employee -> System.out.println(employee.getName()));
        }
    }

    public static void getEmpSalary(List<Employee> employeeList) {
        DoubleSummaryStatistics salaryStats = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("== Salary Statistics ==");
        System.out.println("Average Salary: " + salaryStats.getAverage());
        System.out.println("Total Salary: " + salaryStats.getSum());
    }

    public static void oldestEmp(List<Employee> employeeList) {
        Employee oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        // System.out.println("Oldest Employee is \"" + oldestEmployee.getName() + "\"
        // of age " + oldestEmployee.getAge()
        // + " of department \"" + oldestEmployee.getDepartment() + "\"");
        System.out.println("== Oldest Employee ==");
        System.out.println("Name: " + oldestEmployee.getName());
        System.out.println("Age: " + oldestEmployee.getAge());
        System.out.println("Department: " + oldestEmployee.getDepartment());
    }

    public static void avgSalary(List<Employee> employeeList) {
        System.out.println("== Average Salary by Department ==");
        employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }

    public static void countByDept(List<Employee> employeeList) {
        System.out.println("== Employee Count by Department ==");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }

    public static void getNameOfEmp(List<Employee> employeeList) {
        System.out.println("== Employees who joined after 2015 ==");
        employeeList.stream()
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void getAverageAge(List<Employee> employeeList) {
        Map<String, Double> averageAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age: " + averageAge);
    }

    private static void getDepartmentName(List<Employee> employeeList) {
        System.out.println("== Departments ==");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    }

    private static void getCountOfMaleFemale(List<Employee> employeeList) {
        Map<String, Long> genderCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(genderCount);
    }

    private static void setupEmployeeList(List<Employee> employeeList) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    }
}