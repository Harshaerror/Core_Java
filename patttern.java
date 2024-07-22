public class patttern {
    public static int count(int N){
       int temp=N;
       int reverse;
       while(N>0){
        int digit = N%10;
        reverse = reverse*10+digit;
        N=N/10;
       }
      if(reverse==temp)
    }
    public static void main(String[] args) {
        int N=12340967;
        int c= count(N);
        System.out.println(c);
    }
}
