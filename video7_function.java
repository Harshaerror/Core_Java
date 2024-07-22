import java.util.function.*;
class video7_function{
    public static void main(String[] args) {
        //use of predicate function 
        //to implements conditional checks 
        ///to get more presice code
        //only one argument is taken
        //predicate contain test() method
        //value return in true and false
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(10));



      //result must be in integer value
      //used to perfrom any operation
        Function<Integer,Integer> f =i->i*i;
        System.out.println(f.apply(4));


        //i want to return a length of the string
        // String s ="Durga";//5

        Function<String,String> f1 = s -> s.toUpperCase();
        System.out.println(f1.apply("Durgasoftwaresolutions")); 

        
        Function<String,Integer> f2 = s -> s.length();
        System.out.println(f2.apply("Durgasoftwaresolutions"));

    }
}