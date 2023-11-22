class A{
    A(){
        System.out.println(this.hashCode());
    }
}
class B extends A{
    B(){
        System.out.println(this.hashCode());
}
}
public class objectcallinconstructor {
   public static void main(String[] args) {
    B b = new B();
    //System.out.println(b.hashCode());
   }

}
