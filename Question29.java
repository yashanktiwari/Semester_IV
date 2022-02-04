/*
Q29. Design a method that returns true if element n is a member of given array  and false if not  by using the recursion 
*/
import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int key = scan.nextInt();
        Checks obj = new Checks();
        System.out.println(obj.find(arr, 0, key));
    }
}

class Checks {
    boolean find(int[] arr, int idx, int n) {
        if(idx == arr.length) return false;
        
        if(arr[idx] == n) return true;

        return find(arr, idx+1, n);
    }
}
