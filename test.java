interface inter{
    default void m1(){
        System.out.println("hello my name is harshal");
    }
}

class test implements inter{
    public void m1(){
        System.out.println("method is overriden");
    }
    public static void main(String[] args) {
    test t = new test();
    t.m1();
    }
}