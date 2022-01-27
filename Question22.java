/*
Question:
Q22. write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into a corresponding integer and return the answer. 
Sample Input: 
“2029” 
Sample Output: 
2029
*/
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Convert obj = new Convert();
        int n = obj.convert(s, 0);
        System.out.println(n);
    }
}

class Convert {
    int convert(String s, int idx) {
        if(idx == s.length()) return 0;
        int n = convert(s, idx+1);
        int curn = s.charAt(idx) - '0';
        n = (curn * (int)Math.pow(10, s.length()-idx-1)) + n;
        return n;
    }
}
