import java.util.Objects;

class Vehicle extends Object
{
    String name;
    public String engine(String s ){
 //       System.out.println("engine installed");
        return s;
    }
    public String brakes(){
        return "Breaks addedd to the vehicle";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
class car extends Vehicle{
    public String drive(){
        return "driving the car";
    }

    @Override
    public String brakes() {
        return "overrriding the brakes methods imn subclass";
    }
}

public class Inheritance {
    public static void main(String[] args){
        car cc = new car();
        String result = cc.drive();
        String bb = cc.brakes();;
       String res=  cc.engine("engine installed");
        System.out.println(result);
        System.out.println(res);
        System.out.println(bb);


    }
}

