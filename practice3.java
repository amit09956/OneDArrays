package OneDArrays;
import java.util.Scanner;
import java.util.Arrays;
@SuppressWarnings("unused")
public class practice3 {
    public static void findduplicates(int arr1[],int arr2[],int newarr[]){
        
        for(int i=0;i<arr1.length;i++){
            newarr[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            newarr[arr1.length+j]=arr2[j];
        }
        //sort the array with the help of bubblie sort
        int n=newarr.length;
        for(int p=1;p<=n-1;p++){
           for(int i=0;i<n-p;i++){
            if(newarr[i]>newarr[i+1])
            {
                int temp=newarr[i];
                newarr[i]=newarr[i+1];
                newarr[i+1]=temp;
                
            }
           }
        }
        //print the sorted array with the help of bubble sort
        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
        if(n%2==0){
         double k=(float)(newarr[n/2]+newarr[n/2-1])/2;
         System.out.println(k);
        }
        else{
            float p=newarr[(int)n/2];
            System.out.println(p);
        }
       
        }
        
        
    
     public static void main(String arg[]){
       int arr1[]={1,2};
       int arr2[]={3,4};
       int arr3[]=new int[arr1.length+arr2.length];
       findduplicates(arr1,arr2,arr3);
       

     }

    
}

