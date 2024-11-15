package OneDArray;




import java.util.Scanner;

public class RotateArray {
    public static int [] rotateArray(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int[] ans=new int[n];
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;

    }
    public static void main(String [ ]args){
        int arr[]={1,2,3,4,5,6,7};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        for(int i:rotateArray(arr, k)){
            System.out.print(i);
        }
        System.out.println();

    }
}

