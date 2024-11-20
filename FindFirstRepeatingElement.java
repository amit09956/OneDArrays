//package OneDArray;



public class FindFirstRepeatingElement {
    public static int firstRepeatingElement(int arr[]) {
        int i=0;
            for (int j = i + 1; j < arr.length; j++,i++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
                
            }

            return -1;
        }
    

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 6, 3, 4 };
        int first = firstRepeatingElement(arr);
        System.out.println(first);
    }
}
