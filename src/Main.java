import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(wordToRemove)) {
            text = text.replace(wordToRemove, "");
        }
        System.out.println(text);
    }
}
