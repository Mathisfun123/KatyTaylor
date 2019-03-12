import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class crossroad {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("crossroad.in"));
        PrintWriter out = new PrintWriter( new File("crossroad.out"));
        int numbrofTest = sc.nextInt(); int numcrosses = 0; sc.nextLine();
        HashMap<Integer,Integer> getLastSpotBasedonID = new HashMap<>();
        for(int p = 0; p< numbrofTest; p++){
            String ln = sc.nextLine();
           // System.out.println(ln);
            String temp [] = ln.split(" ");
            int idofcow = Integer.parseInt(temp[0]);
            int pos = Integer.parseInt(temp[1]);
            //System.out.println(idofcow+ " " + pos);
            if(!getLastSpotBasedonID.containsKey(idofcow)){
                getLastSpotBasedonID.put(idofcow,pos);
            }else{
                if(getLastSpotBasedonID.get(idofcow)!=pos){
                    numcrosses++; getLastSpotBasedonID.put(idofcow,pos);
                }else{

                }
            }
        }
        out.println(numcrosses);
        out.close();
    }
}
