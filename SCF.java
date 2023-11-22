//Static control flow in parent child classes   
class SCF {
    static int x =10;
    static{
        m1();
        System.out.println("Base static ");
}
public static void main(String[] args){
    m1();
    System.out.println("Base main");
    }
    public static void m1(){
        System.out.println(y);
}
static int y = 20;
class Derivec extends SCF{
    static int i =100;
    static {
        m2();
        System.out.println("Derive static");
}
public static void main(String[] args){
    m2();
    System.out.println("Derive Main");
}
public static void m2(){
    System.out.println(j);
}
    }
    static{
        System.out.println("Derive static2");
    }
    static int j =200;

}

