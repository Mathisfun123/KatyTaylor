import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Convergeto1 {
	public static void main(String[] args) {
		HashMap<Integer, ArrayList<Integer>> values = new HashMap<>();
		 for(int i = 2; i< 1000; i++ ){
		 	int n = i; int ans= 0;
			 while(n>1){
				 if(n%2==0){
					 n/=2;
					 ans++;
				 }else{
					 n*=3; n+=1;
					 ans++;
				 }
			 }
			 if(values.containsKey(ans)){
			 	values.get(ans).add(i);
			 }else{
			 	ArrayList <Integer> t = new ArrayList<>(); t.add(i);
				 values.put(ans,t);
			 }

		 }
		Set<Integer> elements = values.keySet();
		 TreeSet<Integer> items = new TreeSet<>(elements);
		 for (int i: items){
			 System.out.println("Steps: "+ i + " " + values.get(i));
		 }


	}
}
