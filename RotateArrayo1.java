//package OneDArray;


public class RotateArrayo1 {
    public static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

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

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int k = 1;
        rotateArray(arr, k);
    }

}

