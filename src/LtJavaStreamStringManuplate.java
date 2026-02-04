import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class LtJavaStreamStringManuplate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();


        List<String> namesList = new ArrayList<>();
        for (int i =0; i<n;i++){
            namesList.add(scan.nextLine());
        }
        StringJoiner sj = new StringJoiner("-");
        final List<String> collect = namesList.stream().filter(s -> s.length() % 3 == 0 || s.length() % 4 == 0).collect(Collectors.toList());
        System.out.println(collect);
        for (int i =0; i<collect.size();i++){
            sj.add(collect.get(i));
        }
        System.out.println(sj);
//        collect.stream().forEach(sj::add);
        System.out.println(sj.toString());
        scan.close();

    }
}
