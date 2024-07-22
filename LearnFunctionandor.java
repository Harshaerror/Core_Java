import java.util.function.Function;

class LearnFunctionandor{
    public static void main(String[] args) {
     Function<Integer,Integer> f = i -> i*2;
     Function<Integer,Integer> f1 = i -> i*i*i;
     System.out.println(f.andThen(f1).apply(2));
     System.out.println(f.compose(f1).apply(2));
        
    }
}



//Predicate<T> --> boolean
//Function<T,R> --> R type
//Consumer<T>  --> void