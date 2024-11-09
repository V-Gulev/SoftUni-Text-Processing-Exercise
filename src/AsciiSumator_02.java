import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char[] chars = scanner.nextLine().toCharArray();
        int sum = 0;
        int smallerChar = Math.min(ch1, ch2);
        int biggerChar = Math.max(ch1, ch2);
        for (char k : chars) {
            if (k > smallerChar && k < biggerChar) {
                sum += k;
            }
        }
        System.out.println(sum);
    }
}
