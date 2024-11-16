import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String regex = "@(?<planetName>[A-Z][a-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String input = sc.nextLine();
            String decryptedInput = decryptMessage(input);
            Matcher matcher = pattern.matcher(decryptedInput);

            if (matcher.find()) {
                String name = matcher.group("planetName");
                String attackOrDefense = matcher.group("attackType");
                if (attackOrDefense.equals("A")) {
                    attackedPlanets.add(name);
                } else destroyedPlanets.add(name);

            }

        }

        System.out.printf("Attacked planets: %d\n", attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.printf("Destroyed planets: %d\n", destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    public static String decryptMessage(String input) {
        int count = countChars(input);
        StringBuilder result = new StringBuilder();
        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
            char decryptedChar = (char) (ch - count);
            result.append(decryptedChar);
        }
        return result.toString();
    }

    public static int countChars(String input) {
        int count = 0;
        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
            if (Character.isAlphabetic(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 's' || ch == 't' || ch == 'a' || ch == 'r') {
                    count++;
                }
            }

        }
        return count;
    }

}
