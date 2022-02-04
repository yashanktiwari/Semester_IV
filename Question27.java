/*
Question:
Q27. Print ith Node
For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.
 Note :
Assume that the Indexing for the singly linked list always starts from 0.
If the given position 'i',  is greater than the length of the given singly linked list, then don't print anything.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line contains the value of 'i'. It denotes the position in the given singly linked list.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the node data at the 'i-th' position of the linked list(if exists).

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
i  >= 0
Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
2
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
9 8 4 0 7 8 -1
3
Sample Output 2 :
3
0
*/
import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            LL27 list = new LL27();
            int n = 0;
            while(true) {
                n = scan.nextInt();
                if(n==-1) break;
                list.insertAtEnd(n);
            }
            int i = scan.nextInt();
            System.out.println(list.getNode(i).data);
        }
    }
}

class Node27 {
    int data;
    Node27 next;
    Node27(int data) {
        this.data = data;
        LL27.size++;
    }
}

class LL27 {

    Node27 head;
    static int size;

    LL27() {
        size = 0;
    }

    void insertAtEnd(int n) {
        Node27 newNode = new Node27(n);
        if(head == null) {
            head = newNode;
            return;
        }

        Node27 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    Node27 getNode(int n) {
        int count = 0;
        Node27 temp = head;
        while(count != n) {
            count++;
            temp = temp.next;
        }
        return temp;
    }
}
