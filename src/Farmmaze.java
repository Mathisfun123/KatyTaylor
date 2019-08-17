import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Farmmaze {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Fact> masterySet = new TreeSet<>();        // First Number in TreeMap is equal to exposure
        Scanner sc = new Scanner(new File("farmmaze.in"));
        while(sc.hasNextLine()){
            String ln = sc.nextLine();
            masterySet.add(new Fact(ln));

        } //load data into TreeMap with all of them being added to 0 key ArrayList
        System.out.println(masterySet);

        QuizTime(masterySet);
    }

    private static void QuizTime(TreeSet<Fact> masterySet) {
        Scanner sc2 = new Scanner(System.in);         //Scanner to take input from user
        for(int i = 0; i< 2; i++){
            Fact t = masterySet.pollFirst(); // Get's the lowest exposure

            System.out.println(t.fact);
            if(Integer.parseInt(sc2.nextLine())== (t.year)){
                t.correct++;
                t.exposure++;
            }else{
                t.exposure++;
            } //user attempts to guess year: if correct get correct also incremented
            masterySet.add(t);
         }
        System.out.println(masterySet);


    }
    public static class Fact implements Comparable{
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

        @Override
        public int compareTo(Object o) {
            //First Return Incorrect (Exposure-Correct)
            Fact p =(Fact)o;
            return (int)((this.correct/(double)(this.exposure))- (p.correct/(double)(p.exposure))) != 0? (int)((this.correct/(double)(this.exposure))- (p.correct/(double)(p.exposure))): -1;
        }
    }

}
