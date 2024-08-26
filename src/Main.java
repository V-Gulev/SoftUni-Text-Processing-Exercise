import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String content = scanner.nextLine();
        List<String> comments = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of comments")) {
                break;
            }
            comments.add(input);
        }
        System.out.printf("<h1>%n    %s%n</h1>%n",title);
        System.out.printf("<article>%n    %s%n</article>%n", content);
        for (String j : comments) {
            System.out.printf("<div>%n    %s%n</div>%n", j);
        }

    }
}
