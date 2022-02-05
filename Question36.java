/*
Q36. Write a recursive method for computing the sum of all the elements of an array. Start with an algorithm in English, 
then translate this algorithm into code. 
Trace your method on the example of the following array with 3 elements: 2, 0, and 1.
*/
import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        Calculatee obj = new Calculatee();
        System.out.println(obj.calcSum(arr, 0));
    }
}

class Calculatee {
    int calcSum(int[] arr, int idx) {
        if(idx == arr.length) return 0;
        return arr[idx] + calcSum(arr, idx+1);
    }
}
