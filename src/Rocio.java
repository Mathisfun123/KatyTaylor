import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Rocio {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner( new File("input"));
        while(sc.hasNextLine()){
            int a = sc.nextInt(); int b = sc.nextInt();
            sc.nextLine();
            int n = 0;
            char[][] maze = new char[a][a];
            for(int i = 0; i< b; i++){
                maze[i][i] = '*';
                maze[i][((a-1)-i)]= '*';
            }
            for(int i= a-1; i> (a-1) - b;i-- ){
                maze[i][i]= '*';
                maze[i][((a-1)- i)]= '*';
            }
            for(int i=b; i< a-b; i++){
                for(int j = b; j< a-b;j++){
                    maze[i][j]= '*';
                }
            }
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    if(maze[i][j]== '*')
                        System.out.print(maze[i][j]);
                    else
                        System.out.print(" ");

                }
                System.out.println();
            }
        }
    }
}
