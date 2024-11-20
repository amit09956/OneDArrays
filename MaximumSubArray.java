//package OneDArray;



public class MaximumSubArray {
    public static int  maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            currentSum+=nums[i];
            maxSum=Math.max(maxSum, currentSum);
            if(currentSum<0){
                currentSum=0;
            }
           
        }
        return  maxSum;
    }



    public static void main(String[]args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }

}

