
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.tools.Tool;

import static java.lang.System.*;

public class RandomWritten extends JFrame {
    public static void main(String[] args) throws ParseException {
        TreeSet<Apples> itms = new TreeSet<>();
        itms.add(new Apples("John")); itms.add(new Apples("Smith"));
        out.println(itms);
        Apples m = itms.pollFirst();
        m.x= 1; m.y=2;
        itms.add(m);
        out.println(itms);

    }
    static class Apples implements Comparable {
        int x;
        int y;
        String name;
        public Apples(String s){
            x= 0; y=1;
            name= s;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public int compareTo(Object o) {
            return (this.x)/(this.y)- ((Apples)(o)).x/((Apples)(o)).y != 0? (this.x)/(this.y)- ((Apples)(o)).x/((Apples)(o)).y: 1  ;
        }
    }


    public static void AttemptAtAcronymGen(){
        String arr[] = {"i","a","e","p","s","s","m"};
        int count = 1;
        int[] rem = countLowerCaseLetters(arr);
        HashMap<String, int[]> linkToLettersRemaining= new HashMap<>();
        for(int i = 97; i< 97+26; i++){
            if(rem[i-97]>0) {
                int arr2[] = rem.clone();
                arr2[i-97]--;
                linkToLettersRemaining.put((char)(i)+"", arr2);
            }
        }
        ArrayList<String> stringtoRemove = new ArrayList<>();
        for (String next : linkToLettersRemaining.keySet()) {
            int []rem2 = linkToLettersRemaining.get(next);
            for(int i = 97; i< 97+26; i++){
                if(rem[i-97]>0) {
                    int[] arr2 = rem2.clone();
                    arr2[i-97]--;
                    linkToLettersRemaining.put(next+i, arr2);
                }
            }
            stringtoRemove.add(next);
        }
        for(String i: stringtoRemove){
            linkToLettersRemaining.remove(i);
        }
        for(String p: linkToLettersRemaining.keySet()){
            out.print(p);
            int rem2[] = linkToLettersRemaining.get(p);
            for (int i = 0; i < rem2.length; i++) {
                int i1 = rem2[i];
                out.print(" "+ i1);
            }
            out.println();
        }
    }
    public static int[] countLowerCaseLetters(String arr[]){
        int carr[] = new int[26];
        for (String s : arr) {
            carr[(int) (s.charAt(0)) - 97]++;
        }
        return carr;
    }
    private void CalendarIdeas(){
        Calendar t = Calendar.getInstance();
        t.set(2014, 1, 10); //1 will shift to 2 since data works with 1 beginning
        Date o = t.getTime();
        String output = new SimpleDateFormat("MMMM-dd-YYYY EEEE").format(o);
        out.println(output);
    }
    public static ArrayList<Integer> elementsAfter(String s, int t ){
        String t1[] = s.split(" ");
        int elem [] = new int[t1.length];
        int index = -1;
        for (int i = 0; i < t1.length; i++) {
            elem[i]= Integer.parseInt(t1[i]);
            if(elem[i] == t){
                index=i;
            }
        }

        ArrayList<Integer> vals = new ArrayList<>();
        for(int i = index+1; i< elem.length; i++){
            vals.add(elem[i]);
        }
        return vals;
    }
     private static int recursion(int a, int b){
        if(a== 0 || b ==0 ){
            return a+b;
        }else{
            return recursion(b,a%b);
        }
    }
    //Fix circularArray
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int [] ans = new int[queries.length];
        for(int i =0; i< queries.length;i++){
            int pos = queries[i]+(k-1);
            while(pos> a.length-1){
                pos-=a.length;
            }
            ans[i]= a[pos];
        }
        return ans;

    }
    public static void Decimal() {
        DecimalFormat format = new DecimalFormat("000");
        StringBuilder item = new StringBuilder();
        String ln = "grapes";
        for(int i = 0; i< ln.length(); i++){
            item.append(format.format((int)(ln.charAt(i))));
        }
        String convert = item.toString();
        System.out.println(convert);
        int[] arr = new int[convert.length()/3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(convert.substring((i*3),(i*3)+3));
            System.out.println(arr[i]);
        }
    }
    public static int[][] rotate90Counter(int [][]origmaze){
        int newmaze [][]= new int[origmaze[0].length][origmaze.length];
        for (int i = 0; i < origmaze.length; i++) {
            int[] ints = origmaze[i];
            for (int j = 0; j < ints.length; j++) {
                newmaze[i][ints.length- (j+1)]= origmaze[i][j];

            }
        }
        for (int[] ints : newmaze) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
        return newmaze;
    }
    private static int gcf ( int a, int b){
        if(b==0){
            return a;
        }else{
            return gcf(b, a%b);
        }
    }
    private static int lcf(int val1, int val2){
        return val1* val2/ gcf(val1,val2);
    }
    static class Person implements  Comparable{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            Person p = (Person) o;
            return age-p.age;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}