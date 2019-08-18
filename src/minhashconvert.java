import java.util.ArrayList;

public class minhashconvert {
	public static void main(String[] args) {
		ArrayList<Integer> t = minhash("I love programming!");
		ArrayList<Integer> t2 =  minhash("I love programmin");
		System.out.println(t);
		System.out.println(t2);
		int match = 0;
		for(int i = 0; i< t.size(); i++){
			if(t.get(i) .equals( t2.get(i)) ) {
				match++;
			}
		}
		System.out.println("Matches "+ match + " time out of 32");


	}
	public static ArrayList<Integer> minhash(String s)  {
		int r = (int)(Math.pow(2,5)); int k = 3;
		int buckets = (int)(Math.pow(2,14));
 		boolean array[] = new boolean[k*r];
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)(Math.random() * 2) == 1;
		}
		int[] odd_multipliers = {593689055, 68075479, 1085422463, 847579505, 1889779975, 236698495, 975490195, 1343918321, 1822472975, 101886131, 848998979, 1037846503, 497652787, 911776641, 1257703451, 266786503, 383218293, 1197063121, 83426511, 1392951807, 1893047503, 551598151, 1237439407, 149727591, 680487967, 1079897263, 529999229, 116533725, 1201496723, 915466901, 173947035, 1168509563, 606617893, 1605105309, 1928742653, 1759835367, 671081373, 146895325, 40371763, 50510337, 2050730901, 667785407, 1134849565, 447552957, 1681198347, 1032240217, 1253046615, 318541767, 907422679, 985808567, 575907739, 398703009, 353141125, 1625118031, 1445387667, 137748595, 1333942981, 737448289, 1550993291, 1897138775, 502670197, 516731967, 979750049, 165199405, 1195570785, 743412969, 1669454353, 1911111825, 499317757, 963226257, 408472145, 1696347639, 2093720749, 1277080357, 1564121387, 1466416033, 629259065, 75496373, 427855033, 1855663979, 196269293, 759966853, 798499185, 1072815957, 959884097, 1510670477, 2032739189, 275106685, 151741175, 1117572397, 1229501653, 940193145, 277640349, 598216607, 1261836349, 1380573395}; // set of random odd numbers

		Integer hash_vals [] = new Integer[k*r];
		for(int j = 0; j< s.length()-2; j++ ){
			//parsing string into smaller trigrams
			String ngram = s.substring(j, j+3);
			int hash_ngram = ngram.hashCode() %buckets;
			int index = hash_ngram/ (buckets/(k*r));
			if(index== k*r){ //when hash == number of buckets
				index--;
			}
 			
			//edge case with chunk_index being set to a weird value
			if(hash_vals[index] == null ){
				hash_vals[index] = hash_ngram% (buckets/(k*r));
			}else{
				hash_vals[index] = Math.min(hash_vals[index], hash_ngram% (buckets/(k*r)));
			}
		}
		if(hash_vals[0] == null){
			//Search and find first element to the right with a val
			for(int j =1; j< hash_vals.length && hash_vals[0]==null; j++){
				if(hash_vals[j]!=null){
					hash_vals[0]= hash_vals[j];
				}
			}
		} //fill first
		if(hash_vals[hash_vals.length-1] == null){
			//Search to fill last element
			for(int j = hash_vals.length-2; j>=0 && hash_vals[hash_vals.length-1]==null;j --){
				if(hash_vals[j]!=null){
					hash_vals[hash_vals.length-1]= hash_vals[j];
				}
			}
		} //fill last spot
		for(int j = 1; j< hash_vals.length-1; j++){
			if(hash_vals[j] == null){
				//go left or right based on random bit
				if(array[j]){
					//go right
					for(int right = j+1; right< hash_vals.length && hash_vals[j]== null; right++){
						if(hash_vals[right] != null){
							hash_vals[j] = hash_vals[right];
						}
					}
				}else{
					for(int left = j-1; left>=0 && hash_vals[j] == null; left-- ){
						if(hash_vals[left] != null) {
							hash_vals[j] = hash_vals[left];
						}
					}
				}
			}
		} // fill any spots
		//reduce the hash_vals by summing up portions

		for(int j = 0; j< hash_vals.length;j++){
			if(j%k==0){
				hash_vals[j]= (hash_vals[j] * odd_multipliers[j]) % buckets;
			}else{
				hash_vals[j] = hash_vals[j-1];
				hash_vals[j] = (hash_vals[j] * odd_multipliers[j]) % buckets;
			}
		}
		ArrayList<Integer> items = new ArrayList<>();
		for(int j = k-1; j< hash_vals.length; j+=k){
			items.add(hash_vals[j]);
		}
		return items;
	}
}
