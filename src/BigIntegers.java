import java.util.Scanner;
import java.math.*;
public class BigIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a = BigInteger.ONE;
        for(int i = 2; i<= n; i++){
            System.out.println(i + " " + a.intValue());
            a = a.multiply(BigInteger.valueOf(i));
        }
        System.out.println(a);
    }

}
