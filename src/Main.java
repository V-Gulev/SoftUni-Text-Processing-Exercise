import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder numbers = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        StringBuilder strings = new StringBuilder();
        List<Character> text = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            text.add(input.charAt(i));
        }

        for (Character ch : text) {
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else if (Character.isAlphabetic(ch)) {
                strings.append(ch);
            } else {
                chars.append(ch);
            }
        }
        System.out.println(numbers.toString());
        System.out.println(strings.toString());
        System.out.println(chars.toString());
    }
}
