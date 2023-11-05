class mythreads extends Thread 
{}
class multiThreading{
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        mythreads m = new mythreads();
        System.out.println(Thread.currentThread().getPriority());

    }
} 