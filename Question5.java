/*
Question:
Q5. Write a program to remove consecutive duplicate elements in an array.
Input values
10 10 30 30 40 50 50 50 9 45
Output 
10 30 40 50 9 45
*/
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        Compress c = new Compress();
        int[] arr2 = c.compressArray(arr, 10);
        for(int i=0; i<10; i++) {
            if(arr2[i] != 0)
            System.out.print(arr2[i]+" ");
        }
    }
}

class Compress {
    public int[] compressArray(int arr[], int n) {
        int[] arr2 = new int[n];
        arr2[0] = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr2[count++] = arr[i];
            }
        }
        return arr2;
    }
}
