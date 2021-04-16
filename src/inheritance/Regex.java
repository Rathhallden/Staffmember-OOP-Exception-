package inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean onlystring(String input) {
        String rg = "\\d{1,100}||\\W{1,100}||\\d{1,50}\\W{1,50}||\\W{1,50}\\d{1,50}"; //set regex only string
        Pattern pattern = Pattern.compile(rg);
        Matcher matcher = pattern.matcher(input);
        boolean check = matcher.matches();
        return check;
    }
}
