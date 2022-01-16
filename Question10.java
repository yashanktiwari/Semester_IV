/*
Q10. Create an application that store a sequence of high score entries(with name and score) for a video game in an array. 
A Java class, GameEntry, representing a game entry is as follows:-
public class GameEntry {
  private int score;
  private String name;
  public GameEntry(int score, String name) {
    this.score = score;
    this.name = name;
  }
  // Getter methods that returns the name and score 
  public int getScore() { return score; }
  public String getName() { return name; }
 // here i am returning a string representation of the entry
  @Override
  public String toString() {
    return "("+score + ", "+ name+ ")";
  }
}
*/
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GameEntry[] arr = new GameEntry[5];
        for(int i=0; i<5; i++) {
            arr[i] = new GameEntry(scan.nextInt(), scan.next());
        }
        for(int i=0; i<5; i++) {
            System.out.println(arr[i].toString());
        }
    }
}

class GameEntry {
    private int score;
    private String name;

    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "("+score+","+name+")";
    }
}
