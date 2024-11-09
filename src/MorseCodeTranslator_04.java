import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put(".-", "A");
        morseCodeMap.put("-...", "B");
        morseCodeMap.put("-.-.", "C");
        morseCodeMap.put("-..", "D");
        morseCodeMap.put(".", "E");
        morseCodeMap.put("..-.", "F");
        morseCodeMap.put("--.", "G");
        morseCodeMap.put("....", "H");
        morseCodeMap.put("..", "I");
        morseCodeMap.put(".---", "J");
        morseCodeMap.put("-.-", "K");
        morseCodeMap.put(".-..", "L");
        morseCodeMap.put("--", "M");
        morseCodeMap.put("-.", "N");
        morseCodeMap.put("---", "O");
        morseCodeMap.put(".--.", "P");
        morseCodeMap.put("--.-", "Q");
        morseCodeMap.put(".-.", "R");
        morseCodeMap.put("...", "S");
        morseCodeMap.put("-", "T");
        morseCodeMap.put("..-", "U");
        morseCodeMap.put("...-", "V");
        morseCodeMap.put(".--", "W");
        morseCodeMap.put("-..-", "X");
        morseCodeMap.put("-.--", "Y");
        morseCodeMap.put("--..", "Z");

        String[] morseCodeWords = scanner.nextLine().split("\\|");
        StringBuilder result = new StringBuilder();

        for (String word : morseCodeWords) {
            String[] letters = word.split("\\s+");
            for (String letter : letters) {
                result.append(morseCodeMap.getOrDefault(letter, ""));
            }
            result.append(" ");
        }

        System.out.println(result);
    }
}
