//package OneDArray;


import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {
    public static List<Integer> majorityElement_II(int[] arr) {
        List<Integer>list=new ArrayList<>();
        int count=1;
        int ans=arr[0];
        int arr1=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
        
        else{
            
            count=1;
            arr1=arr[i-1];
            ans=arr[i];
        }
        if(count>arr.length/3){
            list.add(arr1);
            list.add(ans);
        }
        
        }
        return list;
    }
    public static void main(String[]args){
        int arr[]={3,2,3};
        System.out.println(majorityElement_II(arr));
    }
}

