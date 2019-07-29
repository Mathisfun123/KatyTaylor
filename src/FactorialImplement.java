import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FactorialImplement {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("2"); arrayList.add("-4"); 	arrayList.add("1");
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
	public static int factorial (int mult){
		return factorial(1,mult);
	}
	public static void Signature(int r){
		for (int i = 0; i<r; i++){
			System.out.println("\\");
		}
	}


	public static int factorial(int ans, int mult){
		if(mult==1){
			return ans;
		}else{
			return factorial(ans*mult, mult-1);
		}
	}
}
