/*
Question:
Q15. Write a program to print numbers from 1 to n in increasing order recursively.
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
*/

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        Print p = new Print();
        p.prnt(n);
    }
}

class Print{
    public void prnt(int n) {
        if(n==0) return;
        int t = n;
        prnt(n-1);
        System.out.print(t + " ");
    }
}
