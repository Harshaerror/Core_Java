

record Alien (int id, String name){

}


public class project {
    public static void main(String[] args) {
        Alien a1 = new Alien(0, "Arjun");
        Alien a2 = new Alien (1,"Kishna");
        Alien a3 = new Alien (0,"Arjun");
        System.out.println(a2);
        System.out.println(a1.equals(a3));
    }
}
