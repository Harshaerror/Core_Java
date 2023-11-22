class AB{
    public  void m1(int i){
        System.out.println(("parent method"));
    }
}
class BA extends AB{
    public void m1(int i){
        System.out.println("child class ");
    }
}


public class methodoverriding {
    BA b  =new BA();
    b.m1();

}
