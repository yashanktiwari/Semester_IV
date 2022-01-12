/*
Question:
Q6. Me Bean is very good in mathematics. He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) . Can you help him?
Sample Input
5
Sample Output
1
Explanation
5! (Factorial) is 120, so there is one trailing zero.
//Implement it by using loop
*/
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        Count obj = new Count();
        int fact = obj.factorial(n);
        System.out.println(obj.countZeros(fact));
    }
}

class Count {
    public int factorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    public int countZeros(int n) {
        int temp = n;
        int count = 0;
        while(temp>0) {
            int remainder = temp%10;
            if(remainder != 0) {
                break;
            }
            count++;
            temp /= 10;
        }
        return count;
    }
}
