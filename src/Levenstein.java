import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Levenstein {
    public static int distance(String a, String b){
        a= a.toLowerCase(); b = b.toLowerCase();
        int [] costs= new int[b.length()+1];
        for(int i = 0; i< costs.length;i++){
            costs[i]= i;
        }
        for(int i = 1; i<= a.length(); i++){
            costs[0]= i;
            int nw = i-1;
            for(int j = 1; j<= b.length();j++){
                int cj = Math.min(1+Math.min(costs[j],costs[j-1]),a.charAt(i-1)==b.charAt(j-1)? nw : nw+1);
                nw = costs[j];
                costs[j]= cj;
            }
        }
        return costs[b.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get Dictionary: ");
        String text = sc.nextLine();
        System.out.println("Get Guessing Word:  ");
        String keyword = sc.nextLine();
        String data[] = text.split(" ");
        ArrayList<Integer> distances = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            distances.add(distance(data[i], keyword));
        }
        Collections.sort(distances);
        for(int i = 0; i< data.length;i++){
         if(distance(data[i],keyword) == distances.get(0)){
             System.out.println(data[i]+ " "+distances.get(0));
         }
        }
    }
}
