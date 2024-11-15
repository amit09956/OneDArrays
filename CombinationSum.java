package OneDArray;


import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>>result=new ArrayList<>();
     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        for(int i=0;i<candidates.length;i++){
            int sum=0;
            int a=i;
            List<Integer>list=new ArrayList<>();
            for(int j=target;j>=1;j++){
                sum+=candidates[a];
                list.add(candidates[a]);
                if(sum==target){
                    break;
                }
                else if(sum>target){
                    sum=sum-candidates[a];
                    a++;
                    break;
                }
                // else{
                //     //list.remove();
                // }

            }
            result.add(list);

        }
        return result;
    }

    public static void main(String[]args){
        int arr[]={2,3,5,7};
        int target=7;
        System.out.println(combinationSum(arr, target));
    }
    
}

