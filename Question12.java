/*
Q12. Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

Example 
Imagine the size of both the arrays are 5 
myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}
Output :
1,0,5,2,2
*/
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for(int i=0; i<arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        for(int i=0; i<arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        Search ls = new Search();
        for(int i=0; i<arr1.length; i++) {
            System.out.print(ls.search(arr2, arr1[i]) + " ");
        }
    }
}

class Search{
    public int search(int[] arr, int key) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= key) count++;
        }
        return count;
    }
}
