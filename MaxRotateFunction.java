//package OneDArray;


public class MaxRotateFunction {
    public static int[] rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        return arr;

    }

    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
   
    public static int maxRotateFunction(int []arr){
        int max=Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += j * arr[(i + j) % n];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    //another aproach
    public static int maxRotateFunction2(int[] arr) {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        int sum = 0;
        int f=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            f+=i*arr[i];
        }
        for(int i=n-1;i>=0;i--){
            f=f+sum-n*arr[i];//formula is f(1)=f(1)+sum-arr.length*arr[i]
            max=Math.max(max,f);
        }
        return max;
    }

    
    public  static void main(String[] args) {
        int arr[] = {4, 3, 2, 6};
        System.out.println(maxRotateFunction(arr));
    }


}

