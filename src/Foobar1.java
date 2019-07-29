import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Foobar1 {
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,3,3};
        Arrays.sort(arr);
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1); items.add(2);
        Collections.sort(items);
        System.out.println(items);

    }
//    public static int[] removeElem(int [] items, int number){
//       ArrayList<Integer> mupls = new ArrayList<>();
//        for (int item : items) {
//            mupls.add(item);
//        }
//        ArrayList<Integer> alreadyAdded = new ArrayList();
//        HashMap <Integer, ArrayList<Integer>> posBasedOnval = new HashMap<>();
//         for(int i = 0; i< mupls.size(); i++){
//            if(alreadyAdded.contains(mupls.get(i))){
//                posBasedOnval.get(mupls.get(i)).add(i);
//            }else{
//                ArrayList<Integer> lmasdf = new ArrayList<>();
//                lmasdf.add(i);
//                alreadyAdded.add(mupls.get(i)); posBasedOnval.put(mupls.get(i), lmasdf);
//            }
//        }
//
//        for (int i = 0; i < alreadyAdded.size(); i++) {
//             if(posBasedOnval.get(alreadyAdded.get(i)).size() > number){
//                 mupls.removeAll(Arrays.asList(alreadyAdded.get(i)));
//                 //System.out.println(alreadyAdded.get(i)+ " "+ posBasedOnval.get(alreadyAdded.get(i)));
//             }
//
//        }
//        int newarr []= new int[mupls.size()];
//        for (int i = 0; i < mupls.size(); i++) {
//            newarr[i] = mupls.get(i);
//        }
//        return newarr;
//    }
}
