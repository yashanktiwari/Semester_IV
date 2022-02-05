/*
Question:
Q34. The Olympic results are given in a table, where each row represents a country, and columns represent gold, silver, and bronze medals.
For example, the element r[0][0] is the number of gold medals earned by the 0-th country. Write a method that takes the table as an input,
and returns a new array which lists the total number of medals for each country.
For example, if we start with the table
     2   0   1
     3   2   0
     0   0   2
in which the 0-th country earned 2 + 0 + 1 = 3 medals, the 1-st country earned 3 + 2 + 0 = 5 medals, and the 2nd country earned 0 + 0 + 2 = 2
medals, your method should return an array with values
   3
   5
   2
*/
import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        Olympics obj = new Olympics();
        int[] res = obj.getArr(arr);
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

class Olympics {
    public int[] getArr(int[][] arr) {
        int[] finalarr = new int[arr.length];
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = 0;
            for(int j=0; j<3; j++) {
                sum += arr[i][j];
            }
            finalarr[i] = sum;
        }
        return finalarr;
    }
}
