// Experiment 3:
// Linear Search
//Linear search is a simple algorithm used to find an element in a list or array. 
// It works by checking each element one by one until the target is found or the list ends.
//  This method is easy to implement but can be slow for large datasets  
import java.util.Scanner;

public class LinearSearch {
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
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("The list is sorted in ascending order.");
        } else {
            System.out.println("The list is NOT sorted.");
        }

        // Element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Linear Search logic
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

        sc.close();
    }
}