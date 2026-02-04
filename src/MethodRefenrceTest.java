import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;

class  Person{
    Integer age;
    String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }



}
class instanceMethod {
    public static int compareName (Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
    public  int comapareAge (Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }
}
public class MethodRefenrceTest {


    public static void main(String[] args){
        instanceMethod inn = new instanceMethod();
        List<Person> employeeList = new ArrayList<>();
//        employeeList.add(new Person("SNR", 25));
//        employeeList.add(new Person("Java", 90));
//        employeeList.add(new Person("John", 70));
        // Extension of Lambda Expresion
//        Comparator<Person> compAge = new Comparator<Person>() {
//            @Override
//            public int compare(Person a, Person b) {
//
//                return MethodRefenrceTest.comapareAge(a,b);
//            }
//        };
//        Collections.sort(employeeList, compAge);
        // Lambda Expression
       // Collections.sort(employeeList, (a,b) -> MethodRefenrceTest.comapareAge(a,b) );
        //Method reference
        Collections.sort(employeeList, inn::comapareAge);
        Function<Person, Integer> pp = new Function<Person, Integer>() {
            @Override
            public Integer apply(Person x) {
                return x.getAge();
            }
        };
        employeeList.stream()
                //Expand of Map Lambda expression-----------
//                .map(new Function<Person, Integer>() {
//                    @Override
//                    public Integer apply(Person  person ) {
//                        return person.getAge();
//                    }
//                })
                //--------------------------------------------
                //.map(x -> x.getAge())
                .map(Person::getAge)
                .forEach(i -> System.out.println(i));

    }
}
