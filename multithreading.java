// class mythread extends Thread {
//     public void run() {
//         for(int i = 0;i<10;i++){
//      System.out.println("childs thread");
//         }
//         }
// }
// class multithreading{
//     public static void main(String[] args){
//         mythread t = new mythread();
//         t.start();
//         for(int i=0;i<10;i++){
//         System.out.println("main method thraed");
//         }
//     }
// } 

    // class mythread  implements Runnable {
    //     public void run() {
    //         for(int i = 0;i<10;i++){
    //      System.out.println("childs thread");
    //         }
    //         }
    // }
    // class multithreading{
    //     public static void main(String[] args){
    //         mythread t = new mythread();
    //         Thread t1 = new Thread(t);
    //         t1.start();
    //         for(int i=0;i<10;i++){
    //         System.out.println("main method thraed");
    //         }
    //     }
    // } 
class mythread  extends Thread{
    public void run() {
        for(int i = 0;i<10;i++){
     System.out.println("childs thread");
        }
        }
}
class multithreading{
    public static void main(String[] args){
        mythread t = new mythread();
       Thread t1 = new Thread(t);
       /*indirectly instance of mythread is called by passing an 
       argument to the thread instance*/
        t1.start();
        for(int i=0;i<10;i++){
        System.out.println("main method thraed");
        }
    }
} 




// class mythread extends Thread{

// }
// class multithreading{
//     public static void main(String[] args){
//      System.out.println(Thread.currentThread().getName());
//      mythread m = new mythread();
//      System.out.println(m.getName());
//      Thread.currentThread().setName("Harshal Thorat");
//      System.out.println(Thread.currentThread().getName());
//      System.out.println(10/0);
//     }
// }



// class subthread extends Thread {
//     public void run() {
//    System.out.println("run method of subThread " +Thread.currentThread().getName());
//     }
// }
// class multithreading {
//  public static void main(String[] args){
// subthread s =new subthread();
// s.start();
// System.out.println("class multithread with main method "+Thread.currentThread().getName());
// }
// }