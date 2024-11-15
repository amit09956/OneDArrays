package OneDArray;


public class FindMiniumInRotatedArray {
    public static  int findMin(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if( mid<e && arr[mid]>=arr[mid+1]){
               return arr[mid+1];
            }
            if(mid>s && arr[mid]<=arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]<=arr[s]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return arr[0];
    }
    public static void main(String[]args){
        int arr[]={11,13,15,17};
        System.out.println(findMin(arr));
    }
}
