import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class CoinChange {
    public static void main(String[] args) {
        int amoutn = 24;
        int coins [] = {1,4,2,25};
        //ArrayList <Integer> soFar = new ArrayList<>();
        HashMap<Integer,Integer> emptyMap = new HashMap<>();
         System.out.println(calculateItems(coins,amoutn,emptyMap));
    }
   public static int calculateItems(int [] coins, int amount, HashMap <Integer, Integer> map){
       if(amount==0){
           return 0;
       }
       if(map.containsKey(amount)){
           return map.get(amount);
       }
       int min = Integer.MAX_VALUE;
       for(int i = 0; i < coins.length; i++){
           if(coins[i]<= amount){
               int val = calculateItems(coins, amount-coins[i], map);
               min = val>min ? min : val;
           }
       }

       min = min==Integer.MAX_VALUE ?  min : min+1;
       map.put(amount,min);
       return min;
   }
}
