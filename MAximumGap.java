package OneDArray;


import java.util.Arrays;

public class MAximumGap {
  
    public static int maximumGap(int[] nums) {
                int n=nums.length;
        if(n<=1){
            return 0;
        }
       int gap=0;

       Arrays.sort(nums);
       for(int i=1;i<n-1;i++){
        int currGap=nums[i+1]-nums[i];
        if(currGap>gap){
            gap=currGap;
       }
       
    }
    return gap;
    
}

    public static void main(String []args){
        int arr[]={1,1000000};
        System.out.println(maximumGap(arr));
    }
    
}
