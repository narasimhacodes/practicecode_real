import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee3{
    String name;
    Integer salry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalry() {
        return salry;
    }

    public void setSalry(Integer salry) {
        this.salry = salry;
    }
}
public class StreamEX {
    public static void main(String[] args){
//        List<Map<String, Integer>> list = new ArrayList<>();
//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("java", 9723);
//        map1.put("snr", 82972);
//        map1.put("john", 67642);
//
//        list.add(map1);
//        System.out.println(list);
// //       List<Map<String, Integer>> highemployee = list.stream().map(m )
//        for (Map<String, Integer> e : highemployee){
//            System.out.println(e);
//        }
        List<Integer> values = new ArrayList<>();
        values.add(26);
        values.add(44);
        values.add(23);
        values.add(53);
        values.add(95);

//        List<Integer> res = values.stream()
//                .limit(2)
//                .forEach(n -> System.out.println(n));
//        List<Integer> finalres = res.collect(Collectors.toList());
//      System.out.println(finalres);

    }
}
