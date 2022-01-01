import java.math.BigInteger;
import java.util.Scanner;

public class SBigInterger {
    public static void main(String[] args) {
        // BingInteger
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = new BigInteger(sc.next());
        BigInteger n2 = new BigInteger(sc.next());
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
        sc.close();
    }
}
