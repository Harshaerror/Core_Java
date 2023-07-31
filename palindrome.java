//palidrome means that word can read in forword or backword remains same
//using iteration
// class palidrome{
//     public static void main(String args[] ){
//         int num=12021, reverse=0, temp, rem;
//         temp=num;
//         while(temp!=0){
//             rem = temp%10;
//             reverse = (reverse*10)+rem;
//             temp /= 10;
//         }

//         if(num==reverse){
//             System.out.println("palindrome");
//         }
//         else{
//              System.out.println("non palindrome");
//         }
//     }

// }

//using Recursion
class palindrome{
    public static void main(String args[]){
        int num=12021,reverse=0,rem,temp;
        if (getReverse( num, reverse) == num)
        {
            System.out.println("palindrome");

        }
        else
        System.out.println("not palindrome");
    }
     static int getReverse(int num,int reverse){
       if(num==0)
       return reverse;

       int rem=num%10;
       reverse = reverse * 10 + rem;
       return getReverse(num/10,reverse);

    }
}