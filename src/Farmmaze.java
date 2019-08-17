import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Farmmaze {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Integer, ArrayList<Fact>> masterySet = new TreeMap<>();        // First Number in TreeMap is equal to exposure
        Scanner sc = new Scanner(new File("farmmaze.in"));
        while(sc.hasNextLine()){
            String ln = sc.nextLine();
            if(!masterySet.containsKey(0)){
                ArrayList<Fact> t = new ArrayList<>(); t.add(new Fact(ln));
                masterySet.put(0, t);
            }else{
                ArrayList<Fact> t = masterySet.get(0); t.add(new Fact(ln));
                masterySet.put(0,t);
            }

        } //load data into TreeMap with all of them being added to 0 key ArrayList
        System.out.println(masterySet);

        QuizTime(masterySet);
    }
    private static void QuizTime(TreeMap<Integer, ArrayList<Fact>> masterySet){
        Scanner sc2 = new Scanner(System.in);         //Scanner to take input from user
        for(int i = 0; i< 2; i++){
            Map.Entry<Integer, ArrayList<Fact>> t = masterySet.pollFirstEntry(); // Get's the lowest exposure

            //modify only the first ArrayList Fact event
            Fact attemptTime = t.getValue().remove(0); //modify the first element (in the first exposure level)
            System.out.println(attemptTime.fact);
            if(Integer.parseInt(sc2.nextLine())== (attemptTime.year)){
                attemptTime.correct++;
                attemptTime.exposure++;
            }else{
                attemptTime.exposure++;
            } //user attempts to guess year: if correct get correct also incremented

            //adding elements back to TreeMap
            if(t.getValue().size()>0) {
                masterySet.put(t.getValue().get(0).exposure, t.getValue());
            } // if t still has other elements --> can use other element's exposure
            if(!masterySet.containsKey(attemptTime.exposure)){
                ArrayList<Fact> s = new ArrayList<>(); s.add(attemptTime);
                masterySet.put(attemptTime.exposure, s);
            }else {
                ArrayList<Fact> s = masterySet.get(attemptTime.exposure); s.add(attemptTime);
                masterySet.put(attemptTime.exposure,s);
            } //adding the updated Quiz Question
         }
        System.out.println(masterySet);


    }
    public static class Fact {
        int year;
        int exposure;
        int correct;
        String fact;
        Fact(String s){
            year = Integer.parseInt(s.split(" ")[0]);
            fact = s.substring(s.indexOf(" ") +1);
            exposure= 0;
        }

        @Override
        public String toString() {
            return year+ " " + fact;
        }
    }

}
