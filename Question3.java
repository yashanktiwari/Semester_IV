/*
Question:
Q3. Write a program to find whether the array of integers contains a duplicate number. if yes print the location where duplicate numbers are found.
*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        Check3 obj = new Check3();
        obj.checkDuplicates(arr);
    }
}

class Check3 {
    public void checkDuplicates(int[] arr) {

        int n = arr.length;
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++) {
            arr2[arr[i]]++;
        }

        int temp = 0;
        for(int i=0; i<n; i++) {
            if(arr2[i] > 1) {
                temp = i;
                break;
            }
        }

        for(int i=0; i<n; i++) {
            if(arr[i] == temp) {
                System.out.print(i + " ");
            }
        }
        ;
    }
}
