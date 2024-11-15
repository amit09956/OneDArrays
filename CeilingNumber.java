// package OneDArray;

//Binary search aproach
public class CeilingNumber {
    public static int ceilingNU(int arr[],int target){
        if(target>arr[arr.length-1])return -1;
        int s = 0;
        int e = arr.length - 1;
        // find the index  if the target is greater than or equals to target   
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
        return s;
    }
    public static void main(String[]args){
        int arr[]={2,3,5,9,14,16,18};
        int t=15;
        System.out.println(ceilingNU(arr,t));
    }
}

