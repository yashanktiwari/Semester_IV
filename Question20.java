/*
Question:
Q20. Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1
with character c2 in the given string. Do this recursively.
Sample Input :
abaca
a x
Sample Output :
xbxcd
Remove Duplicates Recursively
*/
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.nextLine();
        char c1 = scan.next().charAt(0);
        scan.nextLine();
        char c2 = scan.next().charAt(0);
        Occurence obj = new Occurence();
        System.out.println(obj.replaceChar(s, c1, c2, 0));
    }
}

class Occurence {
    public String replaceChar(String s, char c1, char c2, int idx) {
        if(idx == s.length()) return "";
        String str = replaceChar(s, c1, c2, idx+1);
        if(s.charAt(idx) == c1) str = c2 + str;
        else str = s.charAt(idx) + str;
        return str;
    }
}
