import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] demonNames = sc.nextLine().replace(" ", "").split(",");

        for (String demon : demonNames) {
            int health = calculateHealth(demon);
            double damage = calculateDamage(demon);

            for (char ch : demon.toCharArray()) {
                if (ch == '*') {
                    damage *= 2;
                } else if (ch == '/') {
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage\n", demon, health, damage);
        }

    }

    private static double calculateDamage(String demon) {
        double damage = 0.0;
        String regex = "[-]?[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);

        while (matcher.find()) {
            double currentDamage = Double.parseDouble(matcher.group());
            damage += currentDamage;
        }
        return damage;
    }

    private static int calculateHealth(String demon) {
        int health = 0;

        for (char ch : demon.toCharArray()) {
            if (ch != '+' && ch != '-' && ch != '*' && ch != '/' && !Character.isDigit(ch) && ch != '.') {
                health += ch;
            }
        }
        return health;
    }
}
