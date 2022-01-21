/*
Question:
Q17. Write a program to find and return the sum of all elements of the array. Do this recursively.
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
*/
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        Sum newSum = new Sum();
        System.out.println(newSum.sum(arr, arr.length));
    }
}

class Sum {
    int sum;
    public int sum(int[] arr, int n) {
        if(n>0) {
            sum += arr[n-1];
            sum(arr, n-1);
        }
        return sum;
    }
}
