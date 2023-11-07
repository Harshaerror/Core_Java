// class mythreads extends Thread 
// {}
// class multiThreading{
//     public static void main(String[] args){
//         System.out.println(Thread.currentThread().getPriority());
//         Thread.currentThread().setPriority(6);
//         mythreads m = new mythreads();
//         System.out.println(Thread.currentThread().getPriority());

//     }
// } 



// class multiThreading{
//     public static void main(String[] args){
//         System.out.println(Thread.currentThread().getPriority());
//       Thread.currentThread().setPriority(6);

//     10 is high priority and 1 is low priority

//        try{ Thread.currentThread().setPriority(15);
//         }
//         catch(IllegalArgumentException e){
//     System.out.println("running thread always in between 1 to 10");
//         }
//        mythreads m = new mythreads();
//         System.out.println(m.getPriority());

//     }
// } 



// class mythreads extends Thread{
//     public void run() {
//         for(int i=0;i<=10;i++){
//             System.out.println("child thread");
//         }
//     }
// }
// class multiThreading{
// public static void main(String[] args)
// {
//     mythreads m =new mythreads();
//     m.setPriority(10);
//     m.start();
//     for(int i=0;i<=10;i++){
//     System.out.println("main thread");
//     }
// }}



// class mythreads extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++){
//             Thread.yield();
//             System.out.println("child Thread");
            
//         }
//     }
// }
// class multiThreading{
//     public static void main(String [] args){
//         mythreads m = new mythreads();
//         m.start();
//         for(int i=0;i<10;i++){
//             System.out.println("Main Thread");
//         }

//     }
// }


// class mythread extends Thread {
   
// public void run(){
//         for(int i=0;i<10;i++){
//         System.out.println("Ramam");
        
//         try{
//             Thread.sleep(300);
//         }
//         catch(InterruptedException e){
//                                }
//         }
//     }
// }
// class multiThreading {
//     public static void main(String [] args) throws InterruptedException{
//     mythread s = new mythread();     
//      s.start();
//      s.join(1000);
     
//      for(int i=0;i<10;i++){
//         System.out.println("Raghvamm");
//      }
//     }
// }

//this TWO codes are works same but differently upper one is using time and
// lowesr's using static variable and currentThread() call


class mythread extends Thread {
   static Thread mt;
public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Ramam");
        
        try{
            mt.join(2000);
        }
        catch(InterruptedException e){
                               }
        }
    }
}
class multiThreading {
    public static void main(String [] args) throws InterruptedException{
    mythread.mt = Thread.currentThread();

    mythread s = new mythread();     
     s.start();
    for(int i=0;i<10;i++){
        System.out.println("Raghvamm");
        Thread.sleep(200);
     }
    }
}