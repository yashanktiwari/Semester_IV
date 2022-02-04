/*
Question:
Q33. Palindrome LinkedList
You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec
Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1
*/
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int n = 0;
            LL33 list = new LL33();
            while(true) {
                n = scan.nextInt();
                if(n==-1) break;
                list.insertAtEnd(n);
            }
            System.out.println(list.checkPalindrome());
        }
    }
}

class Node33 {
    int data;
    Node33 next;
    Node33(int data) {
        this.data = data;
    }
}

class LL33 {
    Node33 head;

    void insertAtEnd(int n) {
        Node33 newNode = new Node33(n);
        if(head == null) {
            head = newNode;
            return;
        }

        Node33 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    boolean checkPalindrome() {
        if(head == null) return false;
        if(head.next == null) return true;

        Node33 slow = head;
        Node33 fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node33 start1 = head;
        Node33 start2 = reverse(slow.next);
        while(start2 != null) {
            if(start1.data != start2.data) return false;
            start1 = start1.next;
            start2 = start2.next;
        }
        return true;
    }

    Node33 reverse(Node33 head) {
        if(head == null) return null;
        Node33 preNode = head;
        Node33 curNode = head.next;
        while(curNode != null) {
            Node33 nextNode = curNode.next;
            curNode.next = preNode;

            preNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = preNode;
        return head;
    }
}
