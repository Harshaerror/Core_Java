//in version 17
//sealed keyword is used to permits specific class 
//other class are not granted 
//means it have selaed and permit comination
//only legal keywords(combinations)are ->sealed,non-sealed(normal class),final
sealed class A permits b,c,seal{
void m1(){
    System.out.println("in class A");
}
}
non-sealed class b extends A{
    void m1(){
        System.out.println("in class B");
    }
}
final class c extends A{
    void m1(){
        System.out.println("in class c");
    }
}


non-sealed class seal extends A{
    public static void main(String[] args){
System.out.println("hii");
A obj = new A();
    obj.m1();
    obj=new b();
    obj.m1();
    obj=new c();
    obj.m1();
    }
}