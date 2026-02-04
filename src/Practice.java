import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class  Employee{
    String name;
    Integer id;
    String department;
    Double salary;

    public String getName() {
        return name;
    }

    public Employee(String name, Integer id, String department, Double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
public class Practice {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("snr", 101, "IT", 65000.00 ));
        employees.add(new Employee("john", 102, "IT", 73000.00 ));
        employees.add(new Employee("joe", 103, "QA", 27468.00 ));
        employees.add(new Employee("chris", 104, "IT", 40000.00 ));
        employees.add(new Employee("perri", 105, "IT", 40000.00 ));
        employees.add(new Employee("david", 103, "QA", 27468.00 ));

        // Find all employees in the "IT" department with a salary greater than 50,000,
        //sort them by salary descending, and
        //collect their names into a list

//        List<String> emp = employees.stream()
//                .filter(s -> s.getDepartment().equalsIgnoreCase("IT") && s.getSalary()>50000)
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//        System.out.println(emp);


 //  -- Given a list of Employee objects, write a Java program using Streams to find the second highest salary

//        Optional<Double> res = employees.stream()
//                .map(s->s.getSalary())
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst();
//        System.out.println(res);

        // Group Employees by Department


    }

}
