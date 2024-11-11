import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : input) {
            char encrypted = (char) (ch + 3);
            result.append(encrypted);
        }
        System.out.println(result);
    }
}
