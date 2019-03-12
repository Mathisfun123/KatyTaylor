import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; 
import java.util.ArrayList;
import java.util.Collections;

public class PrimeGenerator {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> threedigitprime = new ArrayList<>();
		for(int i = 101; i< 1000; i++){
			if(isPrime(i)){threedigitprime.add(i);}
		}
		int start  = 4; //start from index 4 for 2 digit primes (seems fancier (not)2*3 = 6 )
		ArrayList<ArrayLIst2> multiply = new ArrayList<>();
		for (int i = start; i < threedigitprime.size(); i++) {
			for(int j = i +1; j< threedigitprime.size(); j++){
				multiply.add(new ArrayLIst2(threedigitprime.get(i)*threedigitprime.get(j)+" " + threedigitprime.get(i)+ " "+ threedigitprime.get(j)+ " "));
			}

		}
		System.out.println(threedigitprime);
		Collections.sort(multiply);
		output(multiply);
		//System.out.println(multiply);


	}
	public static void output(ArrayList<ArrayLIst2> multiply) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(new File("threedigitprimeproductswithsolution"));
		int numperline = 10;
		for (int i = 0; i < multiply.size(); i++) {
			if(i%numperline==0 && i!=0){
				out.println();
				out.print(multiply.get(i) + ",");
			}else{
				if((i+1)%numperline==0 && i!=0){
					out.print(multiply.get(i));
				}else {
					out.print(multiply.get(i) + ",");
				}
			}

		}

		out.close();
	}
	public static boolean isPrime(int val){
		for (int i = 2; i<= Math.sqrt(val); i++) {

			 if(val%i==0){return false;}
		}
		return true;
	}
	 static class ArrayLIst2 implements Comparable{
		public String item;
		public ArrayLIst2(String p){
			item = p;
		}

		 @Override
		 public int compareTo(Object o) {
			 String p = ((ArrayLIst2)o).item;
			 return Integer.parseInt(this.item.split(" ")[0]) - Integer.parseInt(p.split(" ")[0]);
		 }

		 @Override
		 public String toString() {
			 return item;
		 }
	 }
}
