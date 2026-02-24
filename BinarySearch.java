//Experiment 3:
// Binary Search
//Binary search is a fast algorithm used to find an element in a sorted array.
// It works by repeatedly dividing the search range in half, checking the middle element each time. 
// If the target matches the middle, it is found; if it’s smaller, the search continues in the left half,
//  and if larger, in the right half. This method is efficient with a time 
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if array is sorted (ascending)
        boolean ascending = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        if (ascending) {
            System.out.println("The list is sorted in ascending order.");
        } else {
            System.out.println("The list is NOT sorted. Binary search may not work correctly.");
        }

        // Element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform Binary Search only if sorted
        if (ascending) {
            int result = binarySearch(arr, key);

            if (result == -1) {
                System.out.println("Element " + key + " not found in the array.");
            } else {
                System.out.println("Element " + key + " found at index " + result);
            }
        } else {
            System.out.println("Skipping binary search because the list is not sorted.");
        }

        sc.close();
    }

    // Binary Search method
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid; // return index starting from 0
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }
}