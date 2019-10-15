import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DP_Practice {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("CompSci31/Frog 1.in"));
		int n = sc.nextInt();
		int jump = sc.nextInt();
		int [] arr= new int[n];
		for(int i = 0; i< n; i++){
			arr[i]= sc.nextInt();
		}
		if(n<=jump){
			System.out.println(Math.abs(arr[n-1]-arr[0]));
		}else{
			int pos = 0;
			int cost = 0;
			int costarr[] = new int[n];




		}


	}
	public static void travel(int jump, int pos, int [] arr, int[] costarr){
		if(pos + jump>=arr.length-1){
			costarr[pos]= Math.abs(arr[pos]- arr[arr.length-1]);
		}else{
			//fix
			int jump_val = pos;
			for(int i = 1; i<= jump; i++){
				int min = costarr[pos+i];
				if(pos+i<=arr.length-1){
					if(Math.abs(arr[pos+i]-arr[pos])+costarr[pos+i]<= min){
						min = Math.min(Math.abs(arr[pos+i]-arr[pos])+costarr[pos],min);
						jump_val = pos + i;
					}
				}
			}

		}
	}
//	public static void task1() throws FileNotFoundException {
//		Scanner sc = new Scanner(new File("CompSci31/Frog 1.in"));
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		int[] cost = new int[n];
//		cost[0]= 0;
//		for(int i =0; i< n; i++){
//			arr[i]= sc.nextInt();
//		}
//		cost[1]= Math.abs(arr[1]-arr[0]);
//		for(int i = 2; i<n;i++ ){
//			if(i==2){
//				cost[2]= Math.min(Math.abs(arr[2]-arr[0]),Math.abs(arr[2]-arr[1])+cost[1]);
//			}else{
//				cost= minval(cost,arr,i);
//			}
//		}
//
//	}
//	public static int[] frog1minval (int cost[],int arr[], int pos){
//		cost[pos] = Math.min(Math.abs(arr[pos-2]-arr[pos])+cost[pos-2],Math.abs(arr[pos-1]-arr[pos])+cost[pos-1]);
//		return cost;
//	}

}
