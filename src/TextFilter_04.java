import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsToRemove = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String word : wordsToRemove) {
            text = text.replace(word, repeat(word));
        }
        System.out.println(text);
    }

    public static String repeat(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += "*";
        }
        return result;
    }
}
