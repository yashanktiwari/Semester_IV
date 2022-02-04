/*
Q28. Write a recursive function to convert a decimal no into a binary no, print the binary number.
*/
import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Converts obj = new Converts();
        System.out.println(obj.deciToBinary(n));
    }
}

class Converts {
    String deciToBinary(int n) {
        if(n==0) {
            return "";
        }
        String s = deciToBinary(n/2) + (n%2);
        return s;
    }
}
