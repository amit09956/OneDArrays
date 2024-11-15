package  OneDArray;



public class SingleElementInSortedA {
    public static int findSingle(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        if (n == 1)
            return arr[0];

        while (st <= end) {
            int mid = st+(end - st) / 2;
            if (mid == 0 && arr[0] != arr[1])
                return arr[mid];
            if (mid == n - 1 && arr[n - 1] != arr[n - 2])
                return arr [mid];

            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (mid % 2 == 0) {
                if (arr[mid-1] == arr[mid ]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (arr[mid-1] == arr[mid ]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        System.out.println(findSingle(arr));
    }
}

