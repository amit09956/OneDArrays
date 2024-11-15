package OneDArray;



public class SearchElementInRotatedSort {
    public static int findPivot(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if( mid<e && arr[mid]>=arr[mid+1]){
               return mid;
            }
            if(mid>s && arr[mid]<=arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[s]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return -1;
    }
    public static  int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        //if you did not find yhe pivout element then that the mean is array is not sorted
        if(pivot==-1){
            //just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        //if you find the pivot you have found two asc sorted array
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums, pivot, 0, pivot-1);
        }
        return binarySearch(nums, pivot, +1, nums.length-1);
        
    }
    public static int binarySearch(int arr[], int item,int s,int e) {
      
        // find the weather array is sorted in ascending or descending
        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == item) {
                return mid;
            }
            if (isAsc) {
                if (item > arr[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (item < arr[mid]) {
                    s = mid - 1;
                } else {
                    e = mid + 1;
                }
            }
        }
        return -1;
    }
 
    public static void main(String[]args){
        int arr []={4,5,6,7,0,1,2};
       System.out.println(findPivot(arr));

        }

    }
    


