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
            masterySet.put(0, ln.substring(ln.indexOf(" ") +1));
        }
        System.out.println(masterySet);


    }
    public class Fact {
        public int year;
        public int exposure;
        public int correct;
        public String fact;
        public Fact(String s){
            year = Integer.parseInt(s.split(" ")[0]);
            exposure= 0;
        }

    }

}
