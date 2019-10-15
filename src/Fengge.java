
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fengge {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = new int[10];
        for (int i = 1; i < 9; i++) {
            arr[i]= go(i);
            System.out.println(i+" " + (arr[i]-arr[i-1]) + " " +arr[i]);
            arr[i]+= arr[i-1];

        }

    }
    public static int go(int x){
        int[][] m = new int[x][x];
        for(int a = 0; a< x; a++){
            for(int b = 0; b< x; b++){
                m[b][a]= (a+1)*b;
            }
        }
        for(int c = x/2; c< x; c++){
            m[c][c/2]++;
        }

        int s= 0;
        for(int a = 0; a< x; a++){
            for(int b = 0; b< x; b++){
                if(m[a][b]==0){
                    s+= go(a+b);
                }else{
                    s++;
                }
            }
        }
        return s;
    }

}
