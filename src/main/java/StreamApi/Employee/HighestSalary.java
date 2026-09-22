package StreamApi.Employee;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Find the highest salary employee in each department using Stream API
public class HighestSalary {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1,"Aman","Developer",56000,"Bangalore","IT"),
                new Employee(2, "Shyam", "Business-Analyst", 80000, "Pune","HR"),
                new Employee(3, "Amit", "Analyst", 60000, "Bangalore","Admin"),
                new Employee(4, "John", "Developer", 90000, "Mumbai","IT"),
                new Employee(5, "Ravi", "Business-Analyst", 95000, "Bangalore","HR"),
                new Employee(6,"Simran","Developer",990000,"Hyderabad","IT")
        );

//        Map<String, Optional<Employee>> highestInDept = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment)
//                .Comp
    }
}
