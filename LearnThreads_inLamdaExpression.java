//in java 8 features we cant write the implementation of 
//Runnable interface we just use lamda expression and 
//use to your own logic

public class LearnThreads_inLamdaExpression {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++){
                System.out.println("child thread");
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++){
            System.out.println("main thread");
        }
    }


}
