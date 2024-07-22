import java.util.function.*;
class Student{
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
}

public class logicforFunction {
    public static void main(String[] args) {
        Function<Student,String> f =s->{
            int marks=s.marks;
            String grade = "";
            if(marks>80) grade ="A[distinction]";
            else if(marks>60) grade ="B[first]";
            else if(marks>40) grade ="C[second]";
            else if(marks>20) grade ="D[third]";
            else grade ="E[fail]";
            return grade;
        };
        Predicate<Student> p =s->s.marks>=60;

        Student[] s ={
            new Student("Durga",100),
            new Student("Sunny",65 ),
            new Student("bunny",58 ),
            new Student("vinny", 50),
            new Student("Chinny",40),
        };

       Consumer<Student> c =s1->{ 
            System.out.println("Student name" +s1.name);
            System.out.println("Student marks"+ s1.marks);
            System.out.println("Student grade"+ f.apply(s1));
            System.out.println();
        };
        for(Student s1:s){
                c.accept(s1);
        }
        
    }
}
