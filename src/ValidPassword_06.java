import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String password = sc.nextLine();
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                String validPassword = matcher.group("password");
                StringBuilder result = new StringBuilder();

                for (char ch : validPassword.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        result.append(ch);
                    }
                }

                if (result.isEmpty()) {
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + result);
                }

            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}