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




// class mythread extends Thread {
//    static Thread mt;
// public void run(){
//         for(int i=0;i<10;i++){
//         System.out.println("Ramam");
        
//         try{
//             mt.join(2000);/*to wait for the main thread 
//             by calling the direct mt(i.e instance of multiThreading)
//             in mythread(),multiThreading()
//             is saying that 
//             you have to wait for me,
//             mythread() will wait until ( (2000) )
//             after that it will compile
//             with or without multiThreading()*/
//         }
//         catch(InterruptedException e){
//                                }
//         }
//     }
// }
// class multiThreading {
//     public static void main(String [] args) throws InterruptedException{
//     mythread.mt = Thread.currentThread();//pointed to main() thread i.e currentthread 
//     //so that we can call in child thread to join 
//    mythread s = new mythread();     
//      s.start();
//     for(int i=0;i<10;i++){
//         System.out.println("Raghvamm");
//         Thread.sleep(200);
//         //each time loop enters pause ((200)) each time 
//      }
//     }
// }








/*This Program result in Deadlock Situation where 
those are waiting for each other and stucked at a one point*/
// class mythread extends Thread {
//    static Thread mt;
// public void run(){
//         for(int i=0;i<10;i++){
//         System.out.println("Ramam");
        
//         try{
//             mt.join();
//             //wait for multiThreading() object 
//         }
//         catch(InterruptedException e){
//                                }
//         }
//     }
// }
// class multiThreading {
//     public static void main(String [] args) throws InterruptedException{
//     mythread.mt = Thread.currentThread();
//    mythread s = new mythread();     
//      s.start();
//      s.join();
//      //wait for mythread() object
//     for(int i=0;i<10;i++){
//         System.out.println("Raghvamm");
//         Thread.sleep(200);
//      }
//     }
// }








//When thread it self for join() then it will be under Deadlock state


// class multiThreading{
// public static void main(String[] args) throws InterruptedException{
// Thread.currentThread().join();    
// }}





// class multiThreading extends Thread{
//     public static void main(String[] args) throws InterruptedException{
//         for (int i = 0; i<10;i++)
// {
//     System.out.println("Slide "+i);
//     Thread.sleep(2000);
// }    
// }
// }






//intrerrupted();
// class mythread extends Thread{
//     public void run(){
//         try{
//             for(int i =0;i<10;i++){
//                 System.out.println("lazy thread");
//                 Thread.sleep(5000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println("mythread interrupted");
//         }
//     }
// }
// class multiThreading{
//     public static void main(String[] args) {
//  mythread m =new mythread();
//  m.start();
//  m.interrupt();
//  System.out.println("main thread");
//     }
// }


/*
synchronized --> if manipulation of one object by multiple thread
happen that time we should go for synchronized 

using synchronized keyword --> one by one complition of thread 
example-->
books the tickets if available
 */
// class display{
//     public synchronized void wish(String name){
//         for(int n=0;n<10;n++){
//               System.out.print("good moning: ");
//     //   try{
//     //     Thread.sleep(1000);
//     //  }
//     //  catch(InterruptedException e){}
//         System.out.println(name);
//         }
//     }
// }

// class childthread extends Thread{
//     display d;
//     String name;
//     childthread(display d,String name){
//         this.name = name;
//         this.d = d;
//     }
//     public void run(){
//         d.wish(name);
//     }
// }

// class multiThreading{
//     public static void main(String [] args){
// display d = new display();
// childthread t = new childthread(d,"dhoni");
// childthread t1 = new childthread(d,"virat");
// childthread t2 = new childthread(d,"hardik");
// childthread t3 = new childthread(d,"jadeja");
// t.start();
// t1.start();
// t2.start();
// t3.start();
// }
// }






// class display{
//  public  synchronized void  displayn(){
//         for(int i=1;i<=10;i++){
//             System.out.print(i);
//             try{
//                 Thread.sleep(1000);
//             }
//             catch(InterruptedException e){}
//         }
//         System.out.println();
//     }
//     public synchronized void  displays(){
//         for(int i=65;i<75;i++){
//             System.out.print((char)i);
//             try{
//                 Thread.sleep(1000);
//             }
//             catch(InterruptedException e){}
//         }
//     }
// }
// class childthread1 extends Thread{
//     display d;
//     childthread1(display d){
//         this.d=d;
// }
// public void run(){
// d.displayn();
// }
// }
// class childthread2 extends Thread{
//     display d;
//     childthread2(display d){
//         this.d=d;
// }
// public void run(){
// d.displays();
// }
// }

// class multiThreading{
//     public static void main(String[] args){
//         display d = new display();
//         childthread1 c = new childthread1(d);
//         childthread2 c1 = new childthread2(d);
//             c.start();
//             c1.start();
//     }
// } 



class display{
    public void wish(String name){
         ;;;;;;//to many lines of code
      synchronized(this){
            for(int i=0;i<6;i++){
        System.out.println("jay shri ram: ");
        try{
            Thread.sleep(1000);
        }
       catch(InterruptedException e){}
       System.out.println(name);
         }
        }
         ;;;;;;;//to many lines of code
    }
   }
class mythread11 extends Thread{
    display d;
    String name;
    mythread11(display d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}

class multiThreading {
    public static void main(String[] args)
{
    display d = new display();
    mythread11 m = new mythread11(d,"aditya");
    mythread11 m1 = new mythread11(d,"shubham");
    m.start();
    m1.start();

}
}