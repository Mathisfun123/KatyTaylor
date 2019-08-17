import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Farmmaze {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Integer, Fact> masterySet = new TreeMap<>();
        Scanner sc = new Scanner(new File("farmmaze.in"));
        while(sc.hasNextLine()){
            String ln = sc.nextLine();
            masterySet.put(0, new Fact(ln));
        }
        System.out.println(masterySet);
        // First Number in TreeMap is equal to exposure
        Scanner sc2 = new Scanner(System.in);
        for(int i = 0; i< 2; i++){
            Map.Entry<Integer, Fact> t = masterySet.pollFirstEntry();
            System.out.println(t.getValue().fact);
            if(Integer.parseInt(sc2.nextLine())== (t.getKey())){
                t.getValue().correct++;
                t.getValue().exposure++;
            }else{
                t.getValue().exposure++;
            }
            masterySet.put(t.getValue().exposure, t.getValue());
        }
        System.out.println(masterySet);


    }
    public static class Fact {
        public int year;
        public int exposure;
        public int correct;
        public String fact;
        public Fact(String s){
            year = Integer.parseInt(s.split(" ")[0]);
            fact = s.substring(s.indexOf(" ") +1);
            exposure= 0;
        }

    }

}
