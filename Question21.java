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
        System.out.println(obj.findDuplicat(s, 0));
    }
}

class Duplicates{
    public String findDuplicat(String s, int idx) {
        if(idx == s.length()-1) return s.charAt(s.length()-1) + "";
        String str = findDuplicat(s, idx+1);
        if(s.charAt(idx) != str.charAt(0)) str = s.charAt(idx) + str;
        return str;
    }
}
