//package OneDArray;



public class MInClimbingCopst {
    public  static int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        
        int first=0;
        int second=0;
        for(int i=2;i<=n;i++){
           int curr= Math.min(second+cost[i-1],first+cost[i-2]);
            first=second;
            second=curr;

        }
        return second;
    }

        
    
    public static void main(String[]args){
        int arr[]={10,15,20};
        System.out.println(minCostClimbingStairs(arr));
    }
    
}

