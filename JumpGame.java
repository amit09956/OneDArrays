package OneDArray;



public class JumpGame {
    public static boolean  canJump(int[] nums) {
        int lastPos = nums.length;
        if(lastPos==1)return true;
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach) return false;
            else{
                maxReach=i;
            }
        }
        if(maxReach>=lastPos){
            return true;
        }
        return true;
    }

    public static void main(String[]args){
        int arr[]={2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}

