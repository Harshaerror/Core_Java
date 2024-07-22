

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Learnpattern {
    public static void main(String[] args) {
        int count=0;
       // Pattern p = Pattern.compile("aba");
        Pattern p = Pattern.compile("my");
        Matcher m =p.matcher("hello my my my name is harshal");
        while(m.find()){
            count++;
            System.out.println(m.start() + " " + m.end());
        }
        System.out.println("total number of occurences "+count);

    }
}


