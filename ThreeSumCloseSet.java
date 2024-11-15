package OneDArray;


import java.util.Arrays;

public class ThreeSumCloseSet {
    public static  int threeSumCloseSet(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                // int diff = Math.abs(sum - target);
                
                if(Math.abs(currSum- target) < Math.abs(minDiff - target)){
                    minDiff=currSum;
                }
              
               
                if (currSum < target) {
                    left++; // Move the left pointer to the right to increase the sum
                } else {
                    right--; // Move the right pointer to the left to decrease the sum
                }
               
            }
        }
        return minDiff;
        
    }

    public static void main(String[]args){
        int arr[]={-1,2,1,-4};
        int target=1;
        System.out.println(threeSumCloseSet(arr, target));
    }
}

