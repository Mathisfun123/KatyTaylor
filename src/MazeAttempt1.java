import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeAttempt1{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner( new File("MazeIn")); int n = sc.nextInt(); sc.nextLine();
        for(int i = 0; i <  n ; i++){
            int numros = sc.nextInt(); int colsnnum = sc.nextInt(); sc.nextLine();
            Cell[][] maze = new Cell[numros][colsnnum];
            boolean[][] visited = new boolean[numros][colsnnum];
            int Startr = -1;  int startC = -1;
            for(int p = 0; p< numros; p++){
                String ln = sc.nextLine();
                for(int k = 0; k< colsnnum; k ++){
                    maze[p][k]= new Cell(p, k, ln.charAt(k));
                   Startr=  ln.charAt(k)== 'S'? p: Startr;
                   startC = ln.charAt(k)=='S'? k: startC;
                }
            }
            Queue<Cell> q = new LinkedList<>();
            q.add(maze[Startr][startC]);
            maze[Startr][startC].distance= 0;
            int moves = Integer.MAX_VALUE;
            loop:
            while(!q.isEmpty()){
                Cell c = q.poll();
                visited[c.row][c.col] = true;
                if(maze[c.row][c.col].type== 'E'){
                    moves= Math.min(moves, c.distance+1);
                    break loop;
                }
                if(c.row+1< maze.length  && !visited[c.row+1][c.col] && maze[c.row+1][c.col].type!='X'){
                    maze[c.row+1][c.col].distance = Math.min(maze[c.row+1][c.col].distance, c.distance+1);
                    q.add(maze[c.row+1][c.col]);
                }
                if(c.row-1> -1 && !visited[c.row-1][c.col] && maze[c.row-1][c.col].type!='X'){
                    maze[c.row-1][c.col].distance = Math.min(maze[c.row-1][c.col].distance, c.distance+1);
                    q.add(maze[c.row-1][c.col]);
                }if(c.col+1< maze[0].length  && !visited[c.row][c.col+1] && maze[c.row][c.col+1].type!='X'){
                    maze[c.row][c.col+1].distance = Math.min(maze[c.row][c.col+1].distance, c.distance+1);
                    q.add(maze[c.row][c.col+1]);
                }if(c.col-1>-1  && !visited[c.row][c.col-1] && maze[c.row][c.col-1].type!='X'){
                    maze[c.row][c.col-1].distance = Math.min(maze[c.row][c.col-1].distance, c.distance+1);
                    q.add(maze[c.row][c.col-1]);
                }
            }
            System.out.println("MOVES " + moves);
        }

    }


    static class Cell{
        public int row, col,distance;
        public char type;

        public Cell(int row, int col, char type) {
            this.row = row;
            this.col = col;
            this.type = type;
            this.distance=Integer.MAX_VALUE;
        }
    }}