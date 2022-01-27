/*
Question:
Q19. Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print all the  occurrence(index) of search value(7) by holding the index in a result array . Do it recursively 
The prototype of the method is as follows:-
public static int[] res(int arr[], int current index, int search_value)
{
	// set of statements;
} 
*/
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int[] finall = FindAllOccurence.find(arr, 0, 7, 0);
        for(int i=0; i<finall.length; i++) {
            System.out.println(finall[i]);
        }
    }
}

class FindAllOccurence {
    public static int[] find(int[] arr, int currentIndex, int searchValue, int foundSoFar) {
        if(currentIndex == arr.length) return new int[foundSoFar];

        if(arr[currentIndex] == searchValue) foundSoFar++;

        int[] finall = find(arr, currentIndex+1, searchValue, foundSoFar);

        if(arr[currentIndex] == searchValue) finall[--foundSoFar] = currentIndex;

        return finall;
    }
}
