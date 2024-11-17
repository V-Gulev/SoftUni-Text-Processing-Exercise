import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex1 = "[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+";
        String regex2 = "[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]*)+";
        String result = regex1 + "@" + regex2;

        Pattern pattern = Pattern.compile(result);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

