/*
Question:
Q14. Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
*/
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        int x, n;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        n = scan.nextInt();
        Power pwr = new Power();
        System.out.println(pwr.power(x, n));
    }
}

class Power {
    public int power(int n, int p) {
        if(p==0) return 1;
        return n*power(n, p-1);
    }
}
