public class Main {

    public static void main(String[] args) {
        int[] list = new int[10000];

        for (int i = 0; i < 10000; i++) {
            list[i] = i + 1;
        }

        int x = 5001;
        
        int result = new Main().binarySearch(x, list);
        if (result > -1) {
            System.out.println("The location is: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    int binarySearch(int x, int[] list) {
        int i = 0;
        int j = list.length - 1;

        while (i <= j) {
            int m = (i + j) / 2;
            if (list[m] == x) {
                return m + 1;
            }
            if (x > list[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return -1;
    }
}
