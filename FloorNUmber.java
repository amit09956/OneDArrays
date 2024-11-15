package OneDArray;


//Binary search aproach
public class FloorNUmber {
    public static int floorNumber(int arr[],int target){
        if(target<arr[0])return -1;
        int s = 0;
        int e = arr.length - 1;
        // find the weather array is sorted in ascending or descending
        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    s = mid - 1;
                } else {
                    e = mid + 1;
                }
            }
        }
        return e;
    }
    public static void main(String[]args){
        int arr[]={2,3,5,9,14,16,18};
        int t=1;
        System.out.println(floorNumber(arr, t));
    } 
    
}

