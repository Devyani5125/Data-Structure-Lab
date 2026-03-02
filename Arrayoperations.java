// Experiment 1:
// perform different array operations 
// An array is a fundamental data structure in programming that stores a collection of 
// similar data elements (like numbers or text) in a single variable,
//  organized sequentially in contiguous memory locations, 
// allowing each item to be accessed directly using a numerical index, usually starting from 0
import java.util.*;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        while(true){
            System.out.println("\n1.Insert 2.Delete 3.Search 4.Display 5.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if(ch == 1){ // Insert
                System.out.print("Position and value: ");
                int pos = sc.nextInt(), val = sc.nextInt();
                for(int i = n; i >= pos; i--) arr[i] = arr[i-1];
                arr[pos-1] = val; n++;
            } 
            else if(ch == 2){ // Delete
                System.out.print("Position: ");
                int pos = sc.nextInt();
                for(int i = pos-1; i < n-1; i++) arr[i] = arr[i+1];
                n--;
            } 
            else if(ch == 3){ // Search
                System.out.print("Element to search: ");
                int key = sc.nextInt(); boolean found = false;
                for(int i = 0; i < n; i++)
                    if(arr[i] == key){ System.out.println("Found at " + (i+1)); found=true; break; }
                if(!found) System.out.println("Not found");
            } 
            else if(ch == 4){ // Display
                System.out.print("Array: "); for(int i=0;i<n;i++) System.out.print(arr[i]+" "); 
                System.out.println();
            } 
            else break; // Exit
        }
    }
}
