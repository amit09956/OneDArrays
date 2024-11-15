package OneDArray;

import java.util.*;;

public class findDuplicates_II {
    public static boolean findDuplicate(int arr[], int k) {
     Map<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            int j=map.get(arr[i]);
            if(Math.abs(i-j)<=k){
                return true;
            }
            else{
                return false;
            }
        }
     }
     return false;
    }

    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        int arr[] = { 1, 2, 3, 1 ,2,3};
        int k = 2;
        System.out.println(findDuplicate(arr, k));
    }
}
