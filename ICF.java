//instance control flow

class ICF{
int i =10;
{
    m1();
    System.out.println("first instance");
}
ICF(){
System.out.println("constructor");
}
public static void main(String args[])
    {
        ICF i =new ICF();
        System.out.println("main");
        ICF i1 =new ICF();
    }
    public void m1(){
        System.out.println(j);

    }
    {
        System.out.println("second instance");
    }
    int j =20;
}