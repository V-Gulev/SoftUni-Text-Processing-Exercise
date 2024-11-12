import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        int charsToRemove = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '>') {
                charsToRemove += Character.getNumericValue(input.charAt(i + 1));
            } else if (charsToRemove > 0) {
                input.deleteCharAt(i);
                charsToRemove--;
                i--;
            }
        }
        System.out.println(input);


    }
}
