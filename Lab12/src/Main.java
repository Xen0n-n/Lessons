import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {

    public static boolean isStringMatches(String str){
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher match = pattern.matcher(str);
        boolean b = match.matches();
        if (b == true){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isStringMatches(input));
    }
}
