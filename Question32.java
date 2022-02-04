/*
Question:
Q32. Print Reverse LinkedList
You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
Note :
You can’t change any of the pointers in the linked list, just print it in the reverse order.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Constraints :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the singly linked list of integers in a reverse fashion, in a row, separated by a single space.
Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^3
Time Limit: 1sec
Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
5 4 3 2 1
Sample Input 2 :
2
1 2 3 -1
10 20 30 40 50 -1
Sample Output 2 :
3 2 1
50 40 30 20 10
Note:- try to solve this problem by using the iterative statement  and recursive statement 
*/
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            LL32 list = new LL32();
            int n = 0;
            while(true) {
                n = scan.nextInt();
                if(n==-1) break;
                list.insertAtEnd(n);
            }
            list.reverse();
            list.printList();
        }
    }
}

class Node32 {
    int data;
    Node32 next;
    Node32(int data) {
        this.data = data;
    }
}

class LL32 {
    Node32 head;
    void insertAtEnd(int n) {
        Node32 newNode = new Node32(n);
        if(head == null) {
            head = newNode;
            return;
        }

        Node32 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    //iterative method to reverse the list
    void reverse() {
        if(head == null) return;
        Node32 preNode = head;
        Node32 curNode = head.next;
        while(curNode != null) {
            Node32 nextNode = curNode.next;
            curNode.next = preNode;

            preNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    void printList() {
        if(head == null) return;
        Node32 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
