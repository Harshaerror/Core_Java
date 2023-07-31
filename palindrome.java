//palidrome means that word can read in forword or backword remains same
class palidrome{
    public static void main(String args[] ){
        int num=12021, reverse=0, temp, rem;
        temp=num;
        while(temp!=0){
            rem = temp%10;
            reverse = (reverse*10)+rem;
            temp /= 10;
        }

        if(num==reverse){
            System.out.println("palindrome");
        }
        else{
             System.out.println("non palindrome");
        }
    }

}