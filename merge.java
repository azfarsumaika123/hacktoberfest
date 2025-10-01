import java.util.Arrays;

public class MergeSort {

    // Generic merge sort for any Comparable type (e.g., Integer, String, etc.)
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        // Create temporary arrays
        T[] leftTemp = Arrays.copyOfRange(arr, left, mid + 1);
        T[] rightTemp = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        // Merge two sorted halves
        while (i < leftTemp.length && j < rightTemp.length) {
            if (leftTemp[i].compareTo(rightTemp[j]) <= 0) {
                arr[k++] = leftTemp[i++];
            } else {
                arr[k++] = rightTemp[j++];
            }
        }

        // Copy leftovers
        while (i < leftTemp.length) arr[k++] = leftTemp[i++];
        while (j < rightTemp.length) arr[k++] = rightTemp[j++];
    }

    // Utility method for printing arrays
    private static <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 2, 1, 4};
        String[] words = {"zebra", "apple", "monkey", "bear"};

        System.out.println("Original numbers: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("Sorted numbers: ");
        printArray(numbers);

        System.out.println("\nOriginal words: ");
        printArray(words);

        mergeSort(words);

        System.out.println("Sorted words: ");
        printArray(words);
    }
}
