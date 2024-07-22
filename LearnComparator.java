import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class LearnComparator {
    public static void main(String[] args) {
        
        List<Integer> al =Arrays.asList(1,2,3,4);
        System.out.println(al);
        //using lamda expression code will be consice
        Comparator<Integer> com = (i,j) -> (i>j)?-1:(i<j)?1:0;
        Collections.sort(al,com);
        System.out.println(al);
        //using anonymous class code will be consice
        al.stream().forEach(System.out::println);
    List<Integer> l2 = al.stream().filter(i -> i%2 ==0).
    collect(Collectors.toList());
    System.out.println(l2);
         

    }
}
