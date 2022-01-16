/*
Q7. Write a program to input the elements of a two- dimensional array.
Then from this array, make two arrays one that stores all odd elements of the two-dimensional array and the other that 
stores all even elements of the array.
Note:-  Resulting arrays will be of ArrayList type
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        n = scan.nextInt();
        m = scan.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        AL obj = new AL();
        ArrayList<Integer> evenList = obj.convertEven(arr, n, m);
        ArrayList<Integer> oddList = obj.convertOdd(arr, n, m);
        System.out.println(evenList);
        System.out.println(oddList);
    }
}

class AL {
    public ArrayList<Integer> convertEven(int[][] arr, int l, int b) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0; i<l; i++) {
            for(int j=0; j<b; j++) {
                if(arr[i][j]%2==0) {
                    list1.add(arr[i][j]);
                }
            }
        }
        return list1;
    }

    public ArrayList<Integer> convertOdd(int[][] arr, int l, int b) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<l; i++) {
            for(int j=0; j<b; j++) {
                if(arr[i][j]%2!=0) {
                    list2.add(arr[i][j]);
                }
            }
        }
        return list2;
    }
}
