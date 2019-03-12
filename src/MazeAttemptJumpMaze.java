import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeAttemptJumpMaze {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("JumpMaze1.in"));
        while(sc.hasNextLine()){
            String values = sc.nextLine(); String [] daskfjl = values.split("x"); int numRows= Integer.parseInt(daskfjl[1]); int numCols = Integer.parseInt(daskfjl[0]);
            Cell[][] maze = new Cell[numRows][numCols];
            boolean[][] visited = new boolean[numRows][numCols];
            int starR = -1; int starC = -1;
            for(int i = 0; i< numRows ;i++){
                String ln= sc.nextLine();
                for(int k = 0; k< ln.length();k++){
                    maze[i][k]= new Cell(i, k, ln.charAt(k));
                    if(maze[i][k].type=='S'){
                        starR= i; starC= k;
                    }
                }
            }
            //Start Search
            Queue <Cell> q = new LinkedList<>();
            maze[starR][starC].distance=0;
            q.add(maze[starR][starC]);
            int moves = Integer.MAX_VALUE;
            loop:
            while(q.isEmpty()){
                Cell c = q.poll();
                visited[c.row][c.col]= true;
                if(maze[c.row][c.col].type=='E'){
                    moves = Math.min(c.distance,moves);
                    break loop;
                }
                if(c.row+1 < maze.length && !visited[c.row+1][c.col]){
                    if(maze[c.row+1][c.col].type=='-'){
                        maze[c.row+1][c.col].distance = Math.min(1+ c.distance, maze[c.row+1][c.col].distance);
                        q.add(maze[c.row+1][c.col]);
                    }else if(maze[c.row+1][c.col].type=='J'){
                        maze[c.row+1][c.col].distance = Math.min(1+ c.distance, maze[c.row+1][c.col].distance);
                        q.add(maze[c.row+1][c.col]);
                    }
                }
            }
        }
    }
    static class Cell{
        public int row, col, distance;
        public char type;

        public Cell(int row, int col, char type) {
            this.row = row;
            this.col = col;
            this.type = type;
            this.distance= Integer.MAX_VALUE;
        }
    }
    public static void AddExtraWithJUmp(int r, int c){

    }
}
