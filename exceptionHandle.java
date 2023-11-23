

// class exceptionHandle{
//     public static void main(String[] args) 
// {
//     dostuff();
// }
// public static void dostuff(){
// domorestiff();
// }
// public static void domorestiff(){
//     System.out.println(10/0);
// }
// }





// import java.io.*;
// class exceptionHandle {
//     public static void main(String[] args) throws FileNotFoundException{
// PrintWriter pw = new PrintWriter("asc.text");/*checked exception using throws keyword 
// compiles fine without throws keyword FileNotFound exception occure at compile time
//   using throws flow of the program won't be break */ 
//     pw.print("hello");
//     try
//     {System.out.println(10/0);}//
//     }
//     catch(ArithmeticException e){
//         System.out.println("its ok to be make mistake");
//     }
// }







// class exceptionHandle{
//     public static void main(String [] args ){
//         try {
//             System.out.println(10/0);
//         }
//         catch(ArithmeticException e){
            
//             //System.out.println(e);
//             System.out.println(e.getMessage());
//            // System.out.println(e.toString());
//         }
//     }
// }





// class exceptionHandle{
//     public static void main (String [] args){
//         try {
//             Thread.sleep(10000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Wake uppppp");
//         }
//         System.out.println("Sambooo");
//     }
// }





// class exceptionHandle{
//     public static void main(String[] args) throws InterruptedException
//         {
//             dostuff();
//         }
//        public static void dostuff() throws InterruptedException{
//         domorestuff();
//     }
//     public static void domorestuff() throws InterruptedException{
//         Thread.sleep(10000);
// }
//     }


class myThread extends Thread {
int total = 0;
public void run(){
    synchronise(this){
        System..out.println("Child thread starts calculation ");
        for(int i=0;i<100;i++){
            total = total + 1;
        System.out.println("child thread giving notification");
        this.notify();
        }
  }
 }
} 

class exceptionHandling{
public static void main(String args[]) throws Exception{
    myThread b = new myThread();
    b.start();
    synchronised(b){
        System.out.println("Main thread calling wait method");
        b.wait();
        System.out.println("main thread got notification");
        System.out.println(b.total);
    }     
  }
}
    

