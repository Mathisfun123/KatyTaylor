public class MergeSort {
    public static void main(String[] args) {
        int []p = {5,1,2,6,776, 76,53,43,221,2,3,144,5};
        System.out.println(p[0]+" "+p[1]+" "+p[2]);
        mergeSort(p, 0, p.length-1);
        System.out.println("NEW "+ p[0] + p[1]+ p[2]);
    }
    public static void mergeSort(int [] arry, int first, int last){
        if(first< last){
            int mid = (first+ last )/2;
            mergeSort(arry, first,mid);
            mergeSort(arry, mid+1, last);
            merge(arry, first, mid, last);
        }
    }
    public static void merge(int arr[] ,int first, int mid, int last) {
        int n = arr.length; int p = first; int q = mid +1; int k= first;
        int [] temparr= new int[2*n];
        while(p<= mid && q<= last){
            if(arr[p]< arr[q]){
                temparr[k] =arr[p]; p ++; k++;
            }else{
                temparr[k] = arr[q]; q++; k++;
            }
        }
        while(p<=mid){
            temparr[k]= arr[p]; p++; k++;
        }
        while(q<= last){
            temparr[k ]= arr[q]; q++; k++;
        }
        for(int i =first; i<= last; i++){
            arr[i]= temparr[i];
        }
    }

}
