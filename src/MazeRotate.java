import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class MazeRotate {
    public static char[][] newArray;
    public static void main(String[] args) throws FileNotFoundException {
        char [] line1 = {'1','0','0','1'};
        char [] line2 = {'0','1','1','0'};
        char [] line3 = {'1','0','0','1'};
        char [] line4 = {'0','1','1','0'};
        char [][] fullMaze = {line1,line2,line3,line4};
        rotateMaze90(fullMaze);
        rotateMaze90(newArray);

        for(int p = 0; p< fullMaze.length;p++){
            for(int j = 0; j< fullMaze[p].length;j++){
                System.out.print(newArray[p][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotateMaze90(char [][] origMaze){
         newArray = new char[origMaze.length][origMaze[0].length];
        for(int p = 0; p< origMaze.length;p++){
            for(int j = 0; j< origMaze[p].length;j++){
                //System.out.print(origMaze[p][j]+" ");
                newArray[p][j] = origMaze[p][j];
            }
            //System.out.println();
        }
        for(int x = 0; x< newArray.length;x++){
            for(int y= newArray.length-1; y>-1 ;y--){
                newArray[x][newArray.length-y-1] = origMaze[y][x];
            }
        }

    }

}
