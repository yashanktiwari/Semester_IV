/*
Question:
Q35. The 2022 Commonwealth Games, officially known as the XXII Commonwealth Games and commonly known as Birmingham 2022 are about to start. 
To help sports commentators determine in real time how countries are doing, the list of gold medals won by each country was originally 
saved in an array of countries and an array of medals separately. 
To simplify implementation, information has to be transferred from the existing arrays into a linked list. 
Write a Java method to transfer country and gold medal data from the arrays into a linked list with all elements in the same order
*/
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Country[] arr = new Country[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = new Country();
            arr[i].name = scan.next();
            arr[i].gold = scan.nextInt();
            arr[i].silver = scan.nextInt();
            arr[i].bronze = scan.nextInt();
        }
        LL35 list = new LL35();
        list.createLinkedList(arr);
        list.printList();
    }
}

class Country {
    String name;
    int gold;
    int silver;
    int bronze;
}

class Node35<Country> {
    Country data;
    Node35<Country> next;
    Node35(Country data) {
        this.data = data;
    }
}

class LL35 {
    Node35<Country> head;

    void createLinkedList(Country[] arr) {
        for (Country country : arr) {
            Node35<Country> newNode = new Node35<Country>(country);

            if (head == null) {
                head = newNode;
            } else {
                Node35<Country> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
    }

    void printList() {
        if(head == null) return;

        Node35<Country> temp = head;
        while(temp != null) {
            System.out.print("(" + temp.data.name + ": G-"  + temp.data.gold + ", S-" + temp.data.silver + ", B-" + temp.data.bronze + ") -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
