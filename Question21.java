/*
Remove Duplicates Recursively
Q21. In a string S, remove consecutive duplicates from it recursively.
Sample Input 1 :
aabccba
Sample Output 1 :
abcba 
*/
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Duplicates obj = new Duplicates();
        System.out.println(obj.findDuplicat(s, s.length()-1, ""));
    }
}

class Duplicates{
    public String findDuplicat(String s, int n, String newString) {
        if(n==0) return newString+s.charAt(n);
        newString = findDuplicat(s.substring(0, n), n-1, newString);
        if(s.charAt(n) != s.charAt(n-1)) newString = newString + s.charAt(n);
        return newString;
    }
}
