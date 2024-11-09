import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String reversed = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                reversed += line.charAt(i);
            }
            System.out.printf("%s = %s%n", line, reversed);
        }

    }
}
