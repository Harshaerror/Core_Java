class A{
    static int x = B.y;
}
class B extends A{
    static int y = c.z;
    }
    class c extends B {
      static int z= 10;
     
    }


class coupling extends A{
public static int  m1(){
return x;

}
public static void main(String[] args) {
    m1();
}
    }

