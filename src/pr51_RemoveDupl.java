import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class pr51_RemoveDupl {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("pr51.dat"));
        int n = input.nextInt(); input.nextLine();
        for (int i = 0; i < n; i++) {
            TreeSet<String> senternce = new TreeSet<String>();
            String p = input.nextLine();
            for(int j = 0; j< p.length(); j++){
                senternce.add(p.substring(j,j+1));
            }
            senternce.remove(" ");
            StringBuilder out = new StringBuilder();
            for (Iterator<String> iterator = senternce.iterator(); iterator.hasNext(); ) {
                String next =  iterator.next();
                out.append(next);
            }
            System.out.println(out.toString());

        }
    }
}
