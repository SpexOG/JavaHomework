package Java_StreamsAndOptional;

// Given a list of employee objects with attributes: name, department, and salary;
// find the department with the highest total salary.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Mihai", "IT", 4000), new Employee("Marius", "HR", 3000), new Employee("Sebastian", "Engineering", 8000));

        Map<String, Integer> maping = employees.stream().collect(Collectors.groupingBy((Employee::getDepartment), Collectors.summingInt(Employee::getSalary)));

        String highestPaid = maping.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No department found.");

        System.out.println(highestPaid);

    }

}

class Employee {

    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary){

        this.name=name;
        this.department=department;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

}