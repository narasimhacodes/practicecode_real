import java.util.*;
import java.util.stream.Collectors;

public class MaptoArrayList {
    public static void main(String[] args){
        Map<String, Integer> data =new  HashMap<>();
        data.put("snr", 25);
        data.put("java", 30);
        data.put("code", 28);
        data.put("john",31);

        final Iterator<Map.Entry<String, Integer>> iterator = data.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> result =iterator.next();
            System.out.println(result.getKey() + result.getValue());
        }
        List<Map.Entry<String,Integer>> listOfKeys = new ArrayList<>(data.entrySet());
        for (Map.Entry<String,Integer> entry : listOfKeys){
            System.out.println("The keys are "+entry.getKey() +":  The values are"+ entry.getValue());
        }
        System.out.println("------------------------------------");


//Using streams
        List<Map.Entry<String,Integer>> result = data.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        for (Map.Entry<String,Integer> entry : result){
            System.out.println("The keys are "+entry.getKey() +":  The values are"+ entry.getValue());
        }

    }
}
