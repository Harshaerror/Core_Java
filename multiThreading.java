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



class mythreads extends Thread{
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("child thread");
        }
    }
}


class multiThreading{
public static void main(String[] args)
{
    mythreads m =new mythreads();
    m.setPriority(10);
    m.start();
    for(int i=0;i<=10;i++){
    System.out.println("main thread");
    }
}}