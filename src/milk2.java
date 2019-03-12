/*
ID: sairaja
LANG: JAVA
TASK: milk2
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class milk2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner( new File("milk2.in"));
        PrintWriter out = new PrintWriter("milk2.out");
        int n = sc.nextInt();
        //System.out.println(n);
        if(n==1){
            int n1 = sc.nextInt();
            out.print(sc.nextInt()-n1); out.println(" "+ 0);
            out.close();
        }else{
        sc.nextLine();
        int [] startTime = new int[n];
        int [] endTime = new int[n];
        HashMap <Integer,Integer> possVal = new HashMap<>();
        for(int i = 0; i< n;i++){
            startTime [i]= sc.nextInt();
            possVal.put(startTime[i],sc.nextInt());
        }
        Arrays.sort(startTime);
        for(int i = 0; i< n; i++) {
            endTime[i]=possVal.get(startTime[i]);
        }
        HashMap <Integer,Integer> getEndBasedOnStart = new HashMap<>();
        for(int i = 0; i < n ;i++){
            int val = startTime[i];
            if(getEndBasedOnStart.containsKey(val)){
                getEndBasedOnStart.put(startTime[i], Math.max(endTime[i],getEndBasedOnStart.get(startTime[i])));
            }else{
                getEndBasedOnStart.put(startTime[i],endTime[i]);
            }
        }
        TreeSet <Integer> gapTime = new TreeSet<>();
        TreeSet <Integer> workTime = new TreeSet<>();
        for(int i = 1; i< n; i++){
            if(getEndBasedOnStart.get(startTime[i-1]) >= startTime[i]){
                int temp = startTime[i];
                startTime[i] =startTime[i-1];
                getEndBasedOnStart.put(startTime[i-1], Math.max(getEndBasedOnStart.get(temp),getEndBasedOnStart.get(startTime[i-1]) ));
            }else{
                workTime.add(getEndBasedOnStart.get(startTime[i - 1]) - startTime[i - 1]);
                gapTime.add(startTime[i] - getEndBasedOnStart.get(startTime[i - 1]));
            }
            }
            workTime.add(getEndBasedOnStart.get(startTime[n-1])-startTime[n-1]);
            gapTime.add(startTime[n-1] - getEndBasedOnStart.get(startTime[n-2]));
            /*
            for (Integer integer : workTime) {
                System.out.println(integer);
            }
            for (Integer integer : gapTime) {
                System.out.println("HI "+ integer);
            }*/
        if(workTime.last()>0){
            out.print(workTime.last());
        }else{
            out.print(0);
        }
        if(gapTime.last()>0){
            out.println(" "+ gapTime.last());
        }else{
            out.println(" "+ 0);
        }
        out.close();}
    }
    }

