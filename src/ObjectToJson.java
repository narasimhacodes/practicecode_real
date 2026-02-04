class Student{
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age ;
}

public class ObjectToJson {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("snr");
        s.setAge(26);
        System.out.println(s);

    }
}

