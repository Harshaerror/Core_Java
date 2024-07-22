// import java.util.Arrays;
// import java.util.Scanner;

// public class LearnArrays {
   
//    public static boolean checkArray(){
//     int[] a ={1,2,6,4,5,6,7,8,9,10};
//     for(int i=a[1];i<a[9];i++){
//     if(a[i]>=a[i-1]){

//     }
//     else{
//         return false;
// }
// }
// return true;
//     }
//     public static void main(String[] args) {
//       System.out.println(  checkArray());
         
//         }
//     }

import java.util.ArrayList;

class LearnArrays{
    public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();  
      al.add(1);
      al.add(3);
      al.add(2);
      al.add(7);
      al.add(7);
      al.add(6);
      al.add(6);
      al.add(5);
      
      System.out.println(al);
      al.forEach(a->System.out.print(a));

     
    }
}


Interface interf{
 public void m1();
 default void m2(){

 }
 public static void m3(){

 }
    

}