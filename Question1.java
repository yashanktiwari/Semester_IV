import java.util.*;

/*
Question:
Q1. Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks. The structure of student class is as follows
class Student
{
	private int rollno;
	private int marks
	private String name;
}
// create constructor or getter and setter methods as per need
*/

class Student {
    private int rollno;
    private int marks;
    private String name;

    Student(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] arr = new Student[10];
        for(int i=0; i<10; i++) {
            arr[i] = new Student(scan.nextInt(), scan.nextInt(), scan.next());
        }

        ArrayList<Student> al1 = new ArrayList<>();

        for(int i=0; i<10; i++) {
            al1.add(arr[i]);
        }

        int max = 0, min = al1.get(0).getMarks();
        for(int i=0; i<10; i++) {
            if(al1.get(i).getMarks() > max) {
                max = al1.get(i).getMarks();
            }
            if(al1.get(i).getMarks() < min) {
                min = al1.get(i).getMarks();
            }
        }

        for(int i=0; i<10; i++) {
            if(al1.get(i).getMarks() == max) {
                System.out.println(al1.get(i).getName());
                System.out.println(al1.get(i).getRollno());
                System.out.println(al1.get(i).getMarks());
            }

            if(al1.get(i).getMarks() == min) {
                System.out.println(al1.get(i).getName());
                System.out.println(al1.get(i).getRollno());
                System.out.println(al1.get(i).getMarks());
            }
        }

    }
}
