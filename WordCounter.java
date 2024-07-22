
    import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public static void main(String[] args) {
        String statement = "India is my my my country";
        String wordToCount = "my";

        // Using regex to find occurrences of the word
        Pattern pattern = Pattern.compile("\\b" + wordToCount + "\\b");
        Matcher matcher = pattern.matcher(statement);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        // Output the result in the desired format
        System.out.println(wordToCount + " " + count);
    }
}


