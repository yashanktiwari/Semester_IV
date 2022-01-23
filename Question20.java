/*
Q20. Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 
with character c2 in the given string. Do this recursively.
Sample Input :
abaca
a x
Sample Output :
xbxcd
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
        System.out.println(obj.replaceChar(s, c1, c2, s.length()-1, ""));
    }
}

class Occurence {
    public String replaceChar(String s, char c1, char c2, int n, String newString) {
        if(n==-1) return"";
        newString = replaceChar(s.substring(0, n), c1, c2, n-1, newString);
        if(s.charAt(n) == c1) newString = newString + c2;
        else newString = newString + s.charAt(n);
        return newString;
    }
}
