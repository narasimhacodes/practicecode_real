import java.util.*;
import java.util.stream.Stream;

// Duplicate should not allowed to arraylist using custom arraylist
public class ListEx extends ArrayList{
    @Override
    public boolean add(Object o) {
        if (this.contains(o)){
            return true;
        }else
            return super.add(o);
    }

    public static void main(String[] args){
  //      ListEx LL = new ListEx();
        Map<Integer, String> m = new TreeMap<>(Comparator.reverseOrder());
      List<Integer> LL = new ArrayList<>();
       LL.add(1);
       LL.add(2);

       LL.add(3);
       LL.add(1);
       LL.add(2);
       for (Integer list : LL){
           m.put(list, null);
       }
        System.out.println(m);




    }
}

