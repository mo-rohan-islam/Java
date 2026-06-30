import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class StudentsDemo {

    // --- Inner POJO ---
    static class Student {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String department;
        private int yearOfEnrollment;
        private String city;
        private int rank;

        public Student(int id, String firstName, String lastName, int age, String gender,
                String department, int yearOfEnrollment, String city, int rank) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.yearOfEnrollment = yearOfEnrollment;
            this.city = city;
            this.rank = rank;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String getDepartment() {
            return department;
        }

        public int getYearOfEnrollment() {
            return yearOfEnrollment;
        }

        public String getCity() {
            return city;
        }

        public int getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return String.format("Student{id=%d, name=%s %s, dept=%s, rank=%d}",
                    id, firstName, lastName, department, rank);
        }
    }

    public static void main(String[] args) {
        // --- Given data ---
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        // Helper for brief printing
        Function<Student, String> brief = s -> String.format("%d:%s %s [%s] rank=%d",
                s.getId(), s.getFirstName(), s.getLastName(), s.getDepartment(), s.getRank());

        // --- a) First name starts with 'A' ---
        list.stream()
                .filter(student -> student.getFirstName().startsWith("A"))
                .map(brief)
                .forEach(System.out::println);

        // --- b) Group by Department ---
        list.stream()
                .collect(Collectors.groupingBy(Student::getDepartment))
                .entrySet().stream()
                .forEach(entry -> {
                    System.out.println("================================");
                    System.out.println("Department - " + entry.getKey());
                    System.out.println("================================");
                    entry.getValue().stream()
                        .map(brief)
                        .forEach(System.out::println);
                });

    }

}