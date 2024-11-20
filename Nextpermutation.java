//package OneDArray;


import java.util.Arrays;

public class Nextpermutation {
    public static void nextPermutation(int arr[]){
        int n = arr.length;
        int gola_element=-1;
        for(int i=n-1;i>=1;i--){
            if(arr[i-1]<arr[i]){
                gola_element=i-1;
                break;
            }
        }
        if(gola_element==-1){
           reverse(arr, 0, n-1);
        }
        int swap_index=gola_element;
        for(int j=n-1;j>=gola_element+1;j--){
            if(arr[j]>arr[gola_element]){
               swap_index=j;
                break;
            }
            
        }
        int temp=arr[gola_element];
        arr[gola_element]=arr[swap_index];
        arr[swap_index]=temp;
        reverse(arr, gola_element + 1, n - 1);
    }

   
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    
        
    }
    public static void main(String[]args){
        int arr[]={3,1,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}

