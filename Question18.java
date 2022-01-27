/*
Question:
Q18. Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first occurrence(index) of search value. Do it recursively 
The prototype of the method is as follows 
public static int find(int arr[ ], int currentIndex, int search_value)
{
	// set of statements;	
}
*/
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Find.find(arr, 0, 2));
    }
}

class Find {
    public static int find(int[] arr, int currentIndex, int searchValue) {
        if(currentIndex == arr.length) return -1;

        if(arr[currentIndex] == searchValue) {
            return currentIndex;
        } else {
            int n = find(arr, currentIndex+1, searchValue);
            return n;
        }
    }
}
