

// public class methodoverloading {
//     public static void m1(int a){
//         System.out.println("differ arguments have been done");
//     }
//     public static void m1(char c){
//         System.out.println("differ arguments have been done with character");
//     }
//     public static void m1(String s){
//         System.out.println("differ arguments have been done with String");
//     }
//     public static void m1(double f){
//         System.out.println("differ arguments have been done with float");
//     }
//     public static void main(String[] args) {
//         methodoverloading m =new methodoverloading();
//         m.m1(1);
//         m.m1(2.9);
//         m.m1("good");
    

//     }
// }


///Automatic promotion in method overloaing 
// public class methodoverloading {
//     public static void m1(int a){
//         System.out.println("char to int promotion in method overloading ");
//     }
//     public static void m1(float c){
//         System.out.println("long to float promotion in method overloading");
//     }
// public static void main(String[] args) {
//         methodoverloading m =new methodoverloading();
//         m.m1('h');
//         m.m1(4l);}}

        //page 201 of Durgasoft they mention it like what are the possible promotion 
        //when it comes to datatypes in method overloading 

        



         public class methodoverloading {
            public void m1(String s){
                System.out.println("String version");
            }
            public void m1(Object o){
                System.out.println("Object version");
            }
            public static void main(String args[])  {
            methodoverloading m = new methodoverloading();
            m.m1(new Object());
            m.m1("durga");
            m.m1(null);
            
         }}



