// Experiment 3:
// Hashing
// Hashing is a technique used to uniquely identify a specific object from a group of similar objects
// It involves converting a given key into another value, called a hash code, using a hash function.
// The hash code is used to index a hash table, where the original data is stored.  
import java.util.Scanner;

public class hashing {

    static int size = 10;
    static int[] hashTable = new int[size];

    // Initialize table with -1 (empty)
    static void init() {
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1;
        }
    }

    // Insert using linear probing
    static void insert(int key) {
        int index = key % size;

        // Handle collision using linear probing
        while (hashTable[index] != -1) {
            index = (index + 1) % size;
        }

        hashTable[index] = key;
        System.out.println("Inserted at index " + index);
    }

    // Search element
    static void search(int key) {
        int index = key % size;
        int start = index;

        while (hashTable[index] != -1) {
            if (hashTable[index] == key) {
                System.out.println("Element found at index " + index);
                return;
            }
            index = (index + 1) % size;

            if (index == start) break;
        }

        System.out.println("Element not found");
    }

    // Display table
    static void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + hashTable[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();

        int choice, value;

        while (true) {
            System.out.println("\n1.Insert\n2.Search\n3.Display\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insert(value);
                    break;

                case 2:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    search(value);
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}