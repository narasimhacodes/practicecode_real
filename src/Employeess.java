import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employeess {
    private Integer empId;
    private String empName;
    private Integer empAge;
    private String empGender;
    private String empDept;
    private LocalDate doj;
    private Integer salary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employeess{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empGender='" + empGender + '\'' +
                ", empDept='" + empDept + '\'' +
                ", doj=" + doj +
                ", salary=" + salary +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employeess that)) return false;
        return Objects.equals(empId, that.empId) && Objects.equals(empName, that.empName) && Objects.equals(empAge, that.empAge) && Objects.equals(empGender, that.empGender) && Objects.equals(empDept, that.empDept) && Objects.equals(doj, that.doj) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empAge, empGender, empDept, doj, salary);
    }

    public Employeess(Integer empId, String empName, Integer empAge, String empGender, String empDept, LocalDate doj, Integer salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empDept = empDept;
        this.doj = doj;
        this.salary = salary;
    }

    public static void main(String[] args){
        Employeess e = new Employeess (46050451, "Sai Vamsi", 23, "Male", "Java", LocalDate.of (2020,12,15), 27000);
        Employeess e1 = new Employeess (46050452, "Vamsi", 24, "Male", "Java", LocalDate.of (2020,12,15), 29000);
        Employeess e2 = new Employeess (46050453, "Rashmi", 33, "Female", "Full Stack", LocalDate.of (2014,12,15), 120000);
        Employeess e3 = new Employeess (46050454, "Gayatri", 25, "Female", "Data Base", LocalDate.of (2017,01,01), 27000);
        Employeess e4 = new Employeess (46050455, "Need Smith", 28, "Male", "UI", LocalDate.of (2018,12,15), 70000);

        List<Employeess> employeeList = Arrays.asList (e, e1, e2, e3, e4);
// get count of all male and female
        final long count = employeeList.stream().filter(x -> x.getEmpGender() == "Male").count();
        final long count1 = employeeList.stream().filter(x -> x.getEmpGender() == "Female").count();
        System.out.println(count1);
        System.out.println("----------------------------------------------------------------------------");
// get all departments
        final List<String> collect = employeeList.stream().map(x -> x.getEmpDept()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("----------------------------------------------------------------------------");

// get sum of age of all male emp
        final int sum = employeeList.stream().filter(x -> x.getEmpGender() == "Male").mapToInt(y -> y.getEmpAge()).sum();
        System.out.println(sum);
        System.out.println("----------------------------------------------------------------------------");
//get avg of all female empl
        Double c = employeeList.stream().filter(x->x.getEmpGender()=="Female").map(y->y.getEmpAge()).mapToDouble(Integer::valueOf).average().getAsDouble();
        System.out.println(c);
        System.out.println("----------------------------------------------------------------------------");
//get salaries of all employee in higher order
        final List<Integer> collect1 = employeeList.stream().map(x->x.getSalary()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        final List<Employeess> sorted = employeeList.stream().sorted(Comparator.comparing(Employeess::getSalary).reversed()).skip(2).limit(1).collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println("----------------------------------------------------------------------------");
// find you have list of 1000 employees record, you need to get second highest salry receivers name age is between 50 to 60 find uisng streams
        final String first = employeeList.stream().filter(y->y.getEmpAge() >= 20 && y.getEmpAge() <= 25).sorted(Comparator.comparing(Employeess::getSalary).reversed()).skip(1).map(x -> x.getEmpName()).findFirst().orElse("No record found");
        System.out.println(first);

//get employee joined after a particlur date
        final List<String> collect2 = employeeList.stream().filter(x -> x.doj.isBefore(LocalDate.of(2018, 12, 15))|| x.doj.equals(LocalDate.of(2018, 12, 15))).map(Employeess::getEmpName).collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println("----------------------------------------------------------------------------");
//get employee who is small in age list
        final List<String> min = employeeList.stream().min(Comparator.comparing(x->x.getEmpAge())).map(Employeess::getEmpName).stream().collect(Collectors.toList());
        System.out.println("Small age is : " + min);
        System.out.println("----------------------------------------------------------------------------");

//get employee who is less than 25
        final List<String> collect3 = employeeList.stream().filter(x -> x.empAge < 25).map(Employeess::getEmpName).collect(Collectors.toList());
        System.out.println(collect3);
        System.out.println("----------------------------------------------------------------------------");
//get 2nd highest salary in list
        employeeList.stream().sorted(Comparator.comparing(Employeess::getSalary).reversed()).skip(1).limit(1).map(m->m.getEmpName()).forEach(System.out::println);
        final Employeess ee = employeeList.stream().sorted(Comparator.comparing(Employeess::getSalary).reversed()).skip(1).findFirst().orElseThrow();
        System.out.println("2nd Highest salary :" + ee);
        System.out.println("----------------------------------------------------------------------------");

//get employee detailes based on highest salary from each department
        final Map<String, Employeess> collect4 = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employeess::getEmpDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employeess::getSalary)), Optional::get)
                ));
//        final Map<String, Long> collect6 = employeeList.stream()
//                .collect(Collectors.groupingBy(
//                        Employeess::getEmpDept,
//                        Collectors.counting()
//                ));
        System.out.println(collect4);
        System.out.println("----------------------------------------------------------------------------");


// another way

        final Map<String, List<Employeess>> collect5 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept));
        Map<String, List<Employeess>> highDetails = new HashMap<>();
        collect5.forEach((dept,list)-> {
            double maxSalary = list.stream()
                    .mapToDouble(Employeess::getSalary)
                    .max()
                    .orElseThrow();
            List<Employeess> list1 = list.stream().filter(k1->k1.salary == maxSalary).collect(Collectors.toList());
            highDetails.put(dept, list1);

        });
        System.out.println("Highemployee each dept" + highDetails);

        // another recommonded way

        final Map<String, List<Employeess>> collect23 = employeeList.stream().collect(Collectors.groupingBy(
                Employeess::getEmpDept,
                Collectors.collectingAndThen(Collectors.groupingBy(Employeess::getSalary),
                        map -> map.entrySet().stream().max(Map.Entry.comparingByKey()).get().getValue())
        ));
        collect23.forEach((dept, list)-> list.forEach(name -> System.out.println("Recomanded way : " + dept + "->" + name.getEmpName())));


 //get employee from each deparment
        final Map<String, List<Employeess>> collect8 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept));
        collect8.forEach((dept,list)->{
            System.out.println("---------------department-----------" + dept);
            list.forEach(x->System.out.println(x));
        });

        // another approach
        final Map<String, List<String>> collect10 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept,
                Collectors.mapping(Employeess::getEmpName, Collectors.toList())));
        System.out.println("Get employee from each deparment :" + collect10);

// Find students from Hyderabad with a grade greater than 8.0
        final List<Employeess> collect6 = employeeList.stream().filter(x -> x.empAge > 8 && x.getEmpGender() == "Male").collect(Collectors.toList());

        System.out.println(collect6);

        final Optional<String> s = employeeList.stream().max(Comparator.comparing(x -> x.empAge)).map(x -> x.getEmpName());
        System.out.println(s.orElse("Null"));
        final String collect7 = employeeList.stream().map(emp->emp.empName+" "+emp.empGender).collect(Collectors.joining(","));
        System.out.println(collect7);
 // Check if all students are above 18
        final boolean b = employeeList.stream().allMatch(x -> x.getEmpAge() > 18);
        System.out.println(b?true:false);
 // Find the department with the most students
        final Map<String, Long> collect9 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.counting()));
        System.out.println(collect9);
        final String s1 = collect9.entrySet().stream().max(Map.Entry.comparingByValue()).map(v -> v.getKey()).get();
        System.out.println("moststudents :"+s1);
//      Find the student with the longest full name
        final Employeess employeess = employeeList.stream().max(Comparator.comparingInt(x -> x.empName.length())).get();
        System.out.println(employeess);
// Find the names of all EmployeeDtos in the CS department, sorted by age in descending order.
        final List<Employeess> list = employeeList.stream().filter(x -> x.empDept == "Java").sorted(Comparator.comparingInt(Employeess::getEmpAge).reversed()).collect(Collectors.toList());
        System.out.println(list);
// Find the youngest female Employee
        String name =employeeList.stream().filter(f->f.empGender=="Female").max(Comparator.comparing(f->f.getEmpAge())).map(n->n.getEmpName()).get();
        System.out.println(name);
// Find the average age of Employees in each department
        final Map<String, Double> collect11 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.averagingDouble(Employeess::getEmpAge)));
        System.out.println(collect11);
        // 4. Create a map of department -> list of Employee names.
        final Map<String, List<Employeess>> collect15 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept));
        collect15.forEach((dept, list6)->{
            final List<String> collect25 = list6.stream().map(m -> m.getEmpName()).collect(Collectors.toList());
            System.out.println(dept+"->"+collect25);
        });

        //another way

        final Map<String, List<String>> collect12 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.mapping(Employeess::getEmpName, Collectors.toList())));
        System.out.println(collect2);

    }
}

