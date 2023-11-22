class CO{
    CO(){
this(10);
System.out.println("no parameters");
    }
    CO(int x){
this(9.9);
System.out.println("int parameters");
    }
  CO(double d){
    System.out.println("double parameters");
  }  
}


class constructoroverload{
    public static void main(String args[]){

    
CO c = new CO();
    }
}