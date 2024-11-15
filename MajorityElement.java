package OneDArray;



import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] arr) {//o(nlogn)
        Arrays.sort(arr);//o(logn)
       
        int count = 1;int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;ans=arr[i];
            }
            if(count>arr.length/2){
                return ans;
            }
        }
        
        return  -1;
    }
    //another way to find the majority element
    public static int majorityElement1(int arr[]){
        int fre=0,ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(fre==0){
                ans=arr[i];
            }
            if(ans==arr[i]){
                fre++;
            }
            else{
                fre--;
            }
        }
        return ans;
    }
     public static void main(String[]args){
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement1(arr));
    }
    
}
