import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Farmmaze {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Integer, String> masterySet = new TreeMap<>();
        Scanner sc = new Scanner(new File("farmmaze.in"));
        while(sc.hasNextLine()){
            String ln = sc.nextLine(); 
            int year = Integer.parseInt(ln.split(" ")[0]);
            masterySet.put(year, ln.substring(ln.indexOf(" ") +1));
        }
        System.out.println(masterySet);


    }
}
