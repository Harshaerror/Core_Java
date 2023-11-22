class useinstanceblockwithconstructor{
   static int count = 0;
   {
    count++;
   }    
 useinstanceblockwithconstructor(){

 }
 useinstanceblockwithconstructor(int x){

 }
 useinstanceblockwithconstructor(double c){

 }



    public static void main(String args[]){
      useinstanceblockwithconstructor u = new useinstanceblockwithconstructor();
      useinstanceblockwithconstructor g = new useinstanceblockwithconstructor(3);
      useinstanceblockwithconstructor h = new useinstanceblockwithconstructor(3.4);
      System.out.println("the number of objects " + count);
    }
}