// Experiment 1:
// perform different array operations 
// An array is a fundamental data structure in programming that stores a collection of 
// similar data elements (like numbers or text) in a single variable,
//  organized sequentially in contiguous memory locations, 
// allowing each item to be accessed directly using a numerical index, usually starting from 0
import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int n = 0;
        int choice;

        for (;;) {   // program will run until exit
            System.out.println("\n1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Insert
                    if (n < 10) {
                        System.out.print("Enter element: ");
                        arr[n] = sc.nextInt();
                        n++;
                        System.out.println("Inserted");
                    } else {
                        System.out.println("Array full");
                    }
                    break;

                case 2: // Display
                    if (n == 0) {
                        System.out.println("Array empty");
                    } else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Search
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Not found");
                    }
                    break;

                case 4: // Update
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < n) {
                        System.out.print("Enter new value: ");
                        arr[index] = sc.nextInt();
                        System.out.println("Updated");
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Wrong choice");
            }

            if (choice == 5)
                break;
        }

        sc.close();
    }
}
