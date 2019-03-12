
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

import static java.lang.System.*;

public class RandomWritten extends JFrame{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(2);
        System.out.println(items.remove(new Integer(3)));


    }
     public static int recursion(int a, int b){
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
                newmaze[ints.length- (j+1)][i]= origmaze[i][j];

            }
        }
        for (int[] ints : newmaze) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
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
        public int age;
        public String name;

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