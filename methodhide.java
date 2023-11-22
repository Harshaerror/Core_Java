public class methodhide {
    public static void main(String[] args) {
        parent p = new parent();
        p.m1(10);

        child p2 = new child();
        p2.m1(10,10);

        parent p3 = new child();
        p3.m1(10);
    }
}


class parent {
    public void m1(int x){
        System.out.println("parent ");
    }
}
class child extends parent{
    public void m1(int... x){
System.out.println("child ");
    }
}
