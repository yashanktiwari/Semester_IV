/*
Question
Q4. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now write a program to 
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.
(c) find the number of students who have scored below 50 in their average.
(d) display the scores obtained by every student.
*/
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Marks obj = new Marks();
        for(int i=0; i<4; i++) {
            System.out.println("Enter the marks in 5 subjects of Student " + (i+1) + ": ");
            for(int j=0; j<5; j++) {
                obj.marks[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter 1: Display marks of every student");
        System.out.println("Enter 2: Display the average of every student");
        System.out.println("Enter 3: Display the students whose average is less than 50");
        System.out.println("Enter 4: Display the average of every subject");
        int n = scan.nextInt();
        switch (n) {
            case 1 -> obj.display(obj.marks);
            case 2 -> obj.averageStudent(obj.marks);
            case 3 -> obj.lessaverage(obj.marks);
            case 4 -> obj.averageSubject(obj.marks);
        }

    }
}

class Marks {
    int[][] marks = new int[4][5];

    public void averageSubject(int[][] marks) {
        double sum = 0, avg = 0;
        for(int i=0; i<5; i++) {
            sum = 0;
            avg = 0;
            for(int j=0; j<4; j++) {
                sum += marks[j][i];
            }
            avg = sum / 4;
            System.out.println("The average of subject " + (i+1) + " is: " + avg);
        }
    }

    public void averageStudent(int[][] marks) {
        double sum = 0, avg = 0;
        for(int i=0; i<4; i++) {
            avg = 0;
            sum = 0;
            for(int j=0; j<5; j++) {
                sum += marks[i][j];
            }
            avg = sum / 5;
            System.out.println("The average of student " + (i+1) + " is: " + avg);

            if(avg < 50) {
                System.out.println("Student " + (i+1) + " has average less than 50");
            }
        }
    }

    public void lessaverage(int[][] marks) {
        double sum = 0, avg = 0;
        for(int i=0; i<4; i++) {
            avg = 0;
            sum = 0;
            for(int j=0; j<5; j++) {
                sum += marks[i][j];
            }
            avg = sum / 5;

            if(avg < 50) {
                System.out.println("Student " + (i+1) + " has average less than 50");
            }
        }
    }

    public void display(int[][] marks) {
        for(int i=0; i<4; i++) {
            System.out.println("Marks of student " + (i+1) + " are:");
            for(int j=0; j<5; j++) {
                System.out.print(marks[i][j]);
            }
            System.out.println();
        }
    }
}
