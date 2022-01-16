/*
Q8. Write a short Java function that takes an array of int values as an argument and 
determines if there is a pair of numbers in the array whose product is odd.
*/
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        CheckPair cp = new CheckPair();
        if(cp.checkPair(arr)) System.out.println("Yes");
        else System.out.println("No");
    }
}

class CheckPair {
    public boolean checkPair(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]*arr[i+1] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
