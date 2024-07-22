interface interf{
    public static void m1(){
        System.out.println("Interface static method");
    }
}
public class Learninterface implements interf{
    // public static void m1(){
    //     System.out.println("Learninterface static method");
    // }
    public static void main(String[] args) {
        interf.m1();
    }
    
}
