import com.sun.source.tree.UsesTree;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {
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
        if (!(o instanceof EmployeeList that)) return false;
        return Objects.equals(empId, that.empId) && Objects.equals(empName, that.empName) && Objects.equals(empAge, that.empAge) && Objects.equals(empGender, that.empGender) && Objects.equals(empDept, that.empDept) && Objects.equals(doj, that.doj) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empAge, empGender, empDept, doj, salary);
    }

    public EmployeeList(Integer empId, String empName, Integer empAge, String empGender, String empDept, LocalDate doj, Integer salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empDept = empDept;
        this.doj = doj;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employeess e = new Employeess(46050451, "Aai Vamsi", 24, "Male", "Java", LocalDate.of(2020, 12, 15), 27000);
        Employeess e1 = new Employeess(46050452, "Vamsi", 24, "Male", "Java", LocalDate.of(2020, 12, 15), 29000);
        Employeess e2 = new Employeess(46050453, "Rashmi", 33, "Female", "Full Stack", LocalDate.of(2014, 12, 15), 120000);
        Employeess e3 = new Employeess(46050454, "Gayatri", 24, "Female", "Data Base", LocalDate.of(2017, 01, 01), 27000);
        Employeess e4 = new Employeess(46050455, "Need Smith", 28, "Male", "UI", LocalDate.of(2018, 12, 15), 70000);

        List<Employeess> employeeList = Arrays.asList(e, e1, e2, e3, e4);
//        HashSet<String> seen = new HashSet<>();
//        final List<String> collect2 = employeeList.stream().filter(x -> seen.add(x.getEmpDept())).map(m->m.getEmpName()).collect(Collectors.toList());
//        System.out.println(collect2);
        final Map<String, Optional<Employeess>> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.maxBy(Comparator.comparingInt(Employeess::getEmpAge))));
        System.out.println(collect2);
        //another way

        final Map<String, Optional<String>> collect4 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employeess::getEmpAge)), empname -> empname.map(employeess -> employeess.getEmpName()))));
        System.out.println(collect4);


        final Map<Boolean, List<String>> collect3 = employeeList.stream().collect(Collectors.partitioningBy(g -> g.getEmpGender() == "Male", Collectors.mapping(Employeess::getEmpName, Collectors.toList())));
        List<String> male = collect3.get(true);
        List<String> f1 = collect3.get(false);
        System.out.println("males :" + male );
        System.out.println("Female :" + f1);
//        System.out.println(collect3);


        final Map<String, Double> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.averagingDouble(Employeess::getEmpAge)));
        System.out.println(collect1);


        List<String> hh = employeeList.stream().filter(y->y.getEmpDept()=="Java").map(u->u.getEmpName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(hh);
        final Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.counting()));
        System.out.println(collect);

        final String s = employeeList.stream().filter(f -> f.getEmpGender() == "Female").min(Comparator.comparingInt(Employeess::getEmpAge)).map(m -> m.getEmpName()).get();
        System.out.println(s);


//        final List<Integer> collect1 = employeeList.stream().map(y -> y.getEmpName().length()).collect(Collectors.toList());
//        System.out.println(collect1);
//        final List<String> collect2 = employeeList.stream().max(Comparator.comparingInt(r -> r.getEmpName().length())).map(u -> u.getEmpName()).stream().collect(Collectors.toList());
//        System.out.println(collect2);

//        final Map<Boolean, List<String>> collect1 = employeeList.stream().collect(Collectors.partitioningBy(a -> a.getEmpAge() > 24, Collectors.mapping(employeess -> employeess.getEmpName(), Collectors.toList())));
//        System.out.println(collect1);
//        final List<Employeess> above24 = collect1.get(true);
//        final List<Employeess> below24 = collect1.get(false);
//        System.out.println(above24);
//        System.out.println(below24);

//        final boolean b = employeeList.stream().allMatch(s -> s.getEmpAge() > 18);
//        System.out.println(b);
//
//        final Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.counting()));
//        System.out.println(collect);
//        final String s = collect.entrySet().stream().max(Map.Entry.comparingByValue()).map(entry -> entry.getKey()).orElse("No such record");
//        System.out.println(s);
//        employeeList.stream().forEach((empname)->System.out.println(empname.getEmpName()+ "," + empname.getEmpGender()));
//        final String collect4 = employeeList.stream().map(s -> s.getEmpName() + " " + s.getEmpGender()).collect(Collectors.joining(" ,"));
//        System.out.println(collect4);
//
//        final List<String> sorted = employeeList.stream().sorted(Comparator.comparing(Employeess::getEmpAge).thenComparing(Employeess::getSalary)).map(x->x.getEmpName()).collect(Collectors.toList());
//        System.out.println(sorted);
//
//        final List<Employeess> collect = employeeList.stream().filter(x ->x.getEmpGender()=="Male"  && x.getEmpAge() > 25).collect(Collectors.toList());
//        System.out.println(collect);
//        final Optional<Employeess> max = employeeList.stream().max(Comparator.comparing(Employeess::getEmpAge));
//        System.out.println(max);
//        final Map<String, Long> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.counting()));
//        System.out.println(collect1);
//        final Map<String, List<Employeess>> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept));
//        collect2.forEach((dept, list)-> {
//            final Double avearage = list.stream().mapToDouble(x -> x.getSalary()).average().getAsDouble();
//            System.out.println(dept +": " + avearage );
//        });
//        final Map<String, Double> collect3 = employeeList.stream().collect(Collectors.groupingBy(Employeess::getEmpDept, Collectors.averagingDouble(Employeess::getSalary)));
//        System.out.println(collect3);
    }
}
