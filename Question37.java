/*
Question:
Q37. Print an array that contains the exact same number as the given array, but rearrange so that all the even 
numbers come before all the odd numbers. 
Other than that, the numbers can be in any order. 
You may modify and print the given array, or make a new array.

Rearrange ([3,3,2]) -> [2,3,3]
Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
*/
import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrange obj = new Arrange();
        for(int i=0; i<obj.rearrange(arr).length; i++) {
            System.out.print(obj.rearrange(arr)[i] + " ");
        }
        scan.close();
    }
}

class Arrange {
    int[] rearrange(int[] arr) {
        int[] newArr = new int[arr.length];
        int x = 0, y = arr.length/2;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                newArr[x++] = arr[i];
            } else {
                newArr[y++] = arr[i];
            }
        }
        return newArr;
    }
}
