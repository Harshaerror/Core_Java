import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

class Smartphone{
    String name;
    int prize;
    int capacity;

    public Smartphone(String name, int prize, int capacity) {
        this.name = name;
        this.prize = prize;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Smartphone [name=" + name + ", prize=" + prize + ", capacity=" + capacity + "]";
    }
    
    
}




class Learn implements Comparable{
public static void main(String[] args){


    Comparator<Smartphone> com = new Comparator<>(){
       public int compare(Smartphone i,Smartphone j){
        if(i.prize > j.prize) return 1;
        else return -1;
     }
        };
        
     
       // Predicate<Employee> p = (p1) -> p1.capacity > 2000;
        
ArrayList<Smartphone> al = new ArrayList<>();
al.add(new Smartphone("Realme XT",20000,6));
al.add(new Smartphone("Realme Narzo",14000,8));
al.add(new Smartphone("Oppo Reno",18000,4));
al.add(new Smartphone("Iphone 13 pro",50000,12));



Collections.sort(al, com);

//Collections.sort(al, );

//Iterate them using for each loop
for(Smartphone s : al){
    System.out.println(s);
}

}    
}