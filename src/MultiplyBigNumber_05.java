import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        BigInteger multiply = num1.multiply(BigInteger.valueOf(num2));
        System.out.println(multiply);
    }
}
