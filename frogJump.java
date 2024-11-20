//package OneDArray;

public class frogJump {
    public static Boolean  frogJump(int[] nums) {
        int lastPos = nums.length;
        if(lastPos==1)return true;
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach) return false;
            maxReach=Math.max(maxReach,i+nums[i]);
           
        }
        if(maxReach>=lastPos){
            return true;
        }
        return true ;
    }

    public static void main(String[]args){
        int arr[]={0,1,3,5,6,8,12,17};
        System.out.println(frogJump(arr));
    }
    
}

