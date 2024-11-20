//package  OneDArray;
    


import java.util.Scanner;

public class RotateInSpace {
    public static void swapNumber(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverseArray(int arr[],int i,int j){
        j=arr.length;i=0;
        while(i<j){
            swapNumber(arr, i, j);;
            i++;
            j--;
        }
    
    }
    public static void rotateInArray(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
       
    }
    public static void main(String []args){
        int arr[]={1,3,5,6,7,8};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        rotateInArray(arr, k);
        
    }
 
    
}

