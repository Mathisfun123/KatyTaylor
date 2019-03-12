import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class cowqueue {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("cowqueue.in"));
        PrintWriter out = new PrintWriter(new File("cowqueue.out"));
        int numbercases= sc.nextInt(); int timestart [] = new int[numbercases];
        HashMap<Integer,Integer> getLegthbasedonStartTime = new HashMap<>();
        HashMap<Integer,Integer> duplicates = new HashMap<>();
        for(int p = 0; p< numbercases;p++) {
            String ln = sc.nextLine();
            String elem []= ln.split(" ");
            int starttime1 = Integer.parseInt(elem[0]);
            int timetogo = Integer.parseInt(elem[1]);
            timestart[p] = starttime1;
            getLegthbasedonStartTime.put(starttime1,timetogo);
        }
        Arrays.sort(timestart);



        out.close();
    }
}
