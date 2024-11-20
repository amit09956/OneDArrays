//package OneDArray;

//gikven an integer array "a"move all the even integer at the begining of the array folowed byall th e odd integers the relative order 
//of odd or even integers does not matter .return any array that satisfies the condition?

 

public class SortEvenOdd {
    public static void SwapNumber(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int [] sortEvenOdd(int arr[] ){
        int right=arr.length-1;
        int left=0;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2 ==0 ){
                SwapNumber(arr, right, left);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
        return arr;
        }
    

    public  static void main(String[]args){
        int array[]={1,2,3,4,5,6,7,8};
        for(int i:sortEvenOdd(array)){
            System.out.print(i);
        }
        System.out.println();



    }
    
}

