package ArrayList;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
       employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mery", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));


        employeeList.set(1, new Employee("John", "Adams ", 4568));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.size());
    }
}
