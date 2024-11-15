package OneDArray;



import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Permutation {
    public static List<List<Integer>>result=new ArrayList<>();
    public static void helper(int arr[],int index){
        if(index==arr.length){
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : arr) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }
        for(int j=index;j<arr.length;j++){
            reverse(arr,index,j);
            helper(arr, index+1);
            reverse(arr,index,j);
        }
        return ;
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static List<List<Integer>>permutation(int arr[]){
        helper(arr,0);
        return result;
        
    }
    public static void main(String[]args){
        int  arr[]={1,1,2};
        List<List<Integer>>list=permutation(arr);
        // for(List<Integer> s:list){
        //     System.out.print(s);

        // }
        System.out.println(list);
    }
}
