/*
Question:
Q31. Mid-Point Linked List
For a given singly linked list of integers, find and return the node present at the middle of the list.
Note : If the length of the singly linked list is even, then return the first middle node.
Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data values are, 20 and 30. We return the first node with data 20.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space. 
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 Output Format :
For each test case/query, print the data value of the node at the middle of the given list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5 
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
3
Sample Input 2 :
2 
-1
1 2 3 4 -1
Sample Output 2 :
2
*/
import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LL31 list = new LL31();
        int t = scan.nextInt();
        while(t-- > 0) {
            int n = 0;
            while (true) {
                n = scan.nextInt();
                if (n == -1) break;
                list.insertAtEnd(n);
            }
            if(list.findMiddle() != null) System.out.println(list.findMiddle().data);
        }
    }
}

class Node31 {
    int data;
    Node31 next;
    Node31(int data) {
        this.data = data;
    }
}
class LL31 {
    Node31 head;
    void insertAtEnd(int n) {
        Node31 newNode = new Node31(n);
        if(head == null) {
            head = newNode;
            return;
        }

        Node31 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    Node31 findMiddle() {
        if(head == null) return null;

        Node31 slow = head;
        Node31 fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
