import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        String str1 = strings[0];
        String str2 = strings[1];
        int sum = 0;
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            sum += (int) ch1 * ch2;

        }

        if (str1.length() == str2.length()) {
            System.out.println(sum);
        } else if (str1.length() > str2.length()) {
            for (int i = minLength; i < str1.length(); i++) {
                sum += (int) str1.charAt(i);
            }
            System.out.println(sum);
        } else {
            for (int i = minLength; i < str2.length(); i++) {
                sum += (int) str2.charAt(i);
            }
            System.out.println(sum);
        }


    }
}
