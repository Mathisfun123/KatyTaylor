import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fengge {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner( new File("fengge.in"));
        for(int i = 0; i< 1; i ++){
            int r = sc.nextInt(); int c = sc.nextInt();
            String var = sc.next();
            sc.nextLine();
            int maxNum = Math.max(r,c); int minNum= Math.min(r,c);
            for(int p = 0; p< c;p++){
                System.out.print(var);
            }

        }
    }
}
