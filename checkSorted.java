package OneDArray;



public class checkSorted {
    public static boolean checkArrayIsSorted(int arr[]) {
        int n=arr.length-1;
        if(n==0){
            return false; 
        }
        if(n==1){
            return true;
        }
        if(n==2){
            if(arr[1]-arr[0]==1){
                return true;
            }
        }
        int j=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[j++]-arr[i]==1 && arr[i]-arr[i+1]==1){
                return true;
            }
            else{
                return false;
            }

        }
        return false;
    }

    

    public static void main(String[]args){
        int arr[]={3,4,5,1,2};
        System.out.println(checkArrayIsSorted(arr));
    }
}

