import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = sc.nextLine().split(", ");
        boolean validName = false;
        for (String name : usernames) {
            if (name.length() > 3 && name.length() < 16) {
                validName = true;
            } else continue;

            char[] elements = name.toCharArray();
            for (char ch : elements) {
                if (!Character.isDigit(ch) && !Character.isAlphabetic(ch) && ch != '-' && ch != '_') {
                    validName = false;
                    break;
                }
            }
            if (validName) {
                System.out.println(name);
            }
        }


    }
}
