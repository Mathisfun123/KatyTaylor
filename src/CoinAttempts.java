import java.util.*;
import java.io.*;

/**
 * Created by nkure on 12/9/2017.
 */
public class CoinAttempts {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("conversion.in"));
        String s = input.nextLine();
        int n = input.nextInt();
        String array [] = s.split(" ");
        TreeMap<String, Double> f = new TreeMap<>(); //wow look at me using treemaps like I know what I'm doing
        for(int i = 0; i <= array.length-1; i+=2){
            f.put(array[i],Double.parseDouble(array[i+1]));
        }
        for(int i = 1; i <=n; i++){
            double d = input.nextDouble();
            System.out.printf("%.2f",d);
            String l = input.next();
            String p = input.next();
            d/=f.get(l);
            d*=f.get(p);
            System.out.print(" " + l + " = ");
            System.out.printf("%.2f",d);
            System.out.print(" " + p);
            System.out.println();

        }
    }
}