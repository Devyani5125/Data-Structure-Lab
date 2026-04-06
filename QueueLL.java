//Experiment 7:
// Implement a queue using linked list and perform the following operations:
//  Queue using linked list
import java.util.Scanner;

class QueueLL {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node front = null, rear = null;

    void insert(int val) {
        Node newNode = new Node(val);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(val + " inserted");
    }

    void delete() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(front.data + " deleted");
            front = front.next;

            if (front == null)
                rear = null;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        Scanner sc = new Scanner(System.in);
        int choice, val;

        do {
            System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    q.insert(val);
                    break;

                case 2:
                    q.delete();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    }
}
