/*
Question:
Q26. Length Of LL
For a given singly linked list of integers, find and return its length. Do it using an iterative method.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First and the only line of each test case or query contains elements of the singly linked list separated by a single space. 
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the length of the linked list.

Output for every test case will be printed in a separate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
Sample Output 1 :
7
Sample Input 2 :
2
10 76 39 -3 2 9 -23 9 -1
-1
Sample Output 2 :
8
0
*/
import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            LL26 list = new LL26();
            int n = 0;
            while(true) {
                n = scan.nextInt();
                if(n==-1) break;
                list.insertAtEnd(n);
            }
            System.out.println(list.getSize());
        }
    }
}

class Node26 {
    int data;
    Node26 next;

    Node26(int data) {
        this.data = data;
        LL26.size++;
    }
}

class LL26 {
    Node26 head;
    static int size;

    LL26() {
        size = 0;
    }

    void insertAtEnd(int n) {
        Node26 newNode = new Node26(n);
        if(head == null) {
            head = newNode;
            return;
        }

        Node26 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int getSize() {
        return size;
    }
}
