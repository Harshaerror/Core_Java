class A {
    public void setName(String name) {
        name= "Harshal";
        System.out.println(name);
}

public void setroll(int roll){
    roll = 7;
    System.out.println(roll);
}

}
class IS_A_Relation extends A{
    public  void setLacation(String Location){
        Location = "Sangamner";
        System.out.println(Location);
    }
public static void main(String[] args) {
   IS_A_Relation l = new IS_A_Relation();
}
}