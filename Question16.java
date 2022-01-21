/*
Question:
Q16. Write a program to find out and return the number of digits present in a number recursively.
Sample Input 1 :
156
Sample Output 1 :
3
Sample Input 2 :
7
Sample Output 2 :
1
*/
public class Question16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        CountDigits cd = new CountDigits();
        System.out.println(cd.countDigits(n));
    }
}

class CountDigits {
    int count;
    public int countDigits(int n) {
        if(n>0) {
            count++;
            countDigits(n/10);
        }
        return count;
    }
}
