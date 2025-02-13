public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Pick the current element
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            
            arr[j + 1] = key;  // Place the key at its correct position
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
