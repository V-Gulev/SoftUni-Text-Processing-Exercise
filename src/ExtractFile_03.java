import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split("\\\\");
        String file = parts[parts.length - 1];
        String fileName = file.split("\\.")[0];
        String fileExtension = file.split("\\.")[1];
        System.out.printf("File name: %s\nFile extension: %s\n", fileName, fileExtension);

    }
}
