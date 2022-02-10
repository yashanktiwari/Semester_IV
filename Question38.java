/*
Question:
Q38. Enter a string from user and store each character of a string in different nodes of a linked list and print the values 
Input :  neeraj
Output :  n -> e -> e -> r -> a -> j
*/
import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        LL38 list = new LL38();
        for(int i=0; i<s.length(); i++) list.add(s.charAt(i));
        list.printList();
        scan.close();
    }
}

class Node38 {
    char data;
    Node38 next;
    Node38(char data) {
        this.data = data;
    }
}

class LL38 {
    Node38 head;

    void add(char c) {
        Node38 newNode = new Node38(c);
        if(head == null) {
            head = newNode;
            return;
        }
        Node38 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void printList() {
        if(head == null) return;

        Node38 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
