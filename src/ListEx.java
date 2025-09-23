import java.util.*;
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
        ListEx LL = new ListEx();
       LL.add(1);
       LL.add(2);

       LL.add(3);
       LL.add(1);
       LL.add(2);
        System.out.println(LL);



    }
}

