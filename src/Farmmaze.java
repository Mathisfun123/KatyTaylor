import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Farmmaze {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Integer, ArrayList<String>> masterySet = new TreeMap<>();
        Scanner sc = new Scanner(new File("farmmaze.in"));
        while(sc.hasNextLine()){
            ArrayList<String>  tempSet = masterySet.remove(0);
            tempSet.add(sc.nextLine());
            masterySet.put(0, tempSet);
        }
        System.out.println(masterySet);

    }
}
