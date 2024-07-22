import java.util.Arrays;
import java.util.List;

class LearnstreamAPI{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Aob", "Charlie", "David");
long count=names.stream().filter(name -> name.startsWith("A")).count();
System.out.println(count);

    }
}