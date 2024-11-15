package OneDArray;



public class TargetSum {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int arr[] = { 3,2,4 };
        int target = 6;
        int ar[] = twoSum(arr, target);
        for (int i = 0; i < 2; i++) {
            System.out.println(ar[i]);
        }

    }
}
