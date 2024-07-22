import java.util.function.Predicate;

public class Learnandor {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30,35};
        Predicate<Integer> p = i -> i%2 == 0;
        Predicate<Integer> p1 = i -> i>10;
//And or 

for(int ii:x){
  if(p.and(p1).test(ii)) {
System.out.println(ii);
    }
}

    }
}
