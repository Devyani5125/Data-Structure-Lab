// Experiment 4:
// Sorting Algorithms - Selection Sort 
// Selection sort divides the array into two parts:
// Sorted part (Left side)
// Unsorted part (Right side)
// In each pass:
// Find the smallest element from the unsorted part
// Swap it with the first element of the unsorted part
// Increase sorted portion
import java.util.*;
 public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Step 1: Plan the expense tracker website which include the following Features:
// 1st page should be name of the website and a brief description of the website 
// 2nd page should be sign up/login page
// 3rd page should be the dashboard where user can add budget, expense, see different expenses,and 
// see the pie chart visualization of their expenses and all related thimgs
// the interface should be user friendly and attractive
// all tabs should be properly named,organized and properly linked to each other,visible and easily accessible
// suggest a nice name for the website
// website should include:
// ✔ Monthly Budget
// User sets monthly spending limit
// Example:
// January Budget → ₹5000
// February Budget → ₹6000
// Step 2:make a sign up/login system
// Users can create accounts and log in to manage their expenses
// User Authentication (Email/Password)
// Step 3:Expense Entry System
// User should be able to add:
// Expense Amount
// Object Name (Food, Laptop, Recharge etc.)
// Category
// Date
// Month
// year should be from 2026 and onwards
// Payment Method (UPI, Cash, Card etc.)
// Step 3:Pie Chart Visualization
// Show where money is spent
// Categories shown in chart
// Example:
// Food – 40%
// Shopping – 30%
// Travel – 20%
// Other – 10%
// Step 4:Budget Notification System
// Show alerts like:
// 70% Budget Used → Warning
// 90% Budget Used → Danger
// Budget Exceeded → Alert
// i want this website to be very interective,unique,attractive and user friendly
// also include a feature where user can set financial goals and track their progress towards those goals