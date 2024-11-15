package OneDArray;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
  
    public static List<List<Integer>> fourSum(int arr[],int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        
       int n=arr.length;
       for(int i=0;i<n-3;i++){
        if (i > 0 && arr[i - 1] == arr[i]) continue;
        for(int j=i+1;j<n-2;j++){
            if(j>i+1&&arr[j-1]==arr[j])continue;
            int left=j+1;
            int right=n-1;
            
            while(left<right){
                long sum=arr[i]+arr[j];
                sum+=arr[left]+arr[right];
                if(sum==target){
                    result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left - 1] == arr[left]) left++;
                    while (left<right && arr[right + 1] == arr[right]) right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
       } 
       return result;
    }
    public static void main(String[]args){
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        System.out.println(fourSum(arr, target));
    }
    
}

