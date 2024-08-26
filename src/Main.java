import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] keyString = scanner.nextLine().split(" ");
        int[] key = new int[keyString.length];

        for (int i = 0; i < key.length; i++) {
            key[i] = Integer.parseInt(keyString[i]);
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("find")) {
                break;
            }
            StringBuilder result = new StringBuilder();
            int index = 0;
            for (int i = 0; i < input.length(); i++) {
                char decrypted = (char) (input.charAt(i) - key[index]);
                result.append(decrypted);
                index++;
                if (index == key.length){
                    index = 0;
                }
            }
            String type = result.substring(result.indexOf("&") + 1, result.lastIndexOf("&"));
            String location = result.substring(result.indexOf("<") + 1, result.indexOf(">"));
            System.out.printf("Found %s at %s%n", type, location);
        }


    }
}
