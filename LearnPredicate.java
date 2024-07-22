import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
     String name;
     int salary;
   
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

}
public class LearnPredicate {
    public static void main(String[] a){
       
    ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("Durgs",3000));
        list.add(new Employee("ravi",4000));
        list.add(new Employee("shiva",5000));
        list.add(new Employee("mahesh",1000));
        list.add(new Employee("adarsh",2000));
       Predicate<Employee> p = (e) -> e.salary > 2000;
        for(Employee employee : list){
           if(p.test(employee)){
      System.out.println(employee.name+" : "+employee.salary);
           }
        }
    }
}
 