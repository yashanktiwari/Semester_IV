/*
Q30. In a sorted linked list (elements are sorted in ascending order), eliminate duplicates from the given linked list, 
such that output linked list contains only unique elements. 
*/
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        LL30 list = new LL30();
        while(true) {
            n = scan.nextInt();
            if(n==-1) break;
            list.insertAtEnd(n);
        }
        list.removeDuplicates();
        list.printList();
    }
}

class Node30 {
    int data;
    Node30 next;
    Node30(int data) {
        this.data = data;
    }
}

class LL30 {

    Node30 head;

    void insertAtEnd(int n) {
        Node30 newNode = new Node30(n);
        if(head == null) {
            head = newNode;
            return;
        }

        Node30 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void removeDuplicates() {
        if(head == null || head.next == null) return;

        Node30 preNode = head;
        Node30 curNode = head.next;
        while(curNode != null) {
            if (preNode.data == curNode.data) {
                while(preNode.data == curNode.data) {
                    curNode = curNode.next;
                }
                preNode.next = curNode;
            }
            preNode = curNode;
            curNode = curNode.next;
        }
    }

    void printList() {
        if(head == null) return;

        Node30 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
