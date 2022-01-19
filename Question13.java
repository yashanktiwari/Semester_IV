/*
Q13.In GLA University there is various department. It is asked to every dept to conduct meeting for all the employees of GLA University. The central Management asked the dept kindly share starting time and ending time of the meeting in 24 hours format so that after verifying it will be circulated among the GLA employees.
But there is a problem that before circulating the meeting information, the central management will find out if there are any clashes between time or not. If there are clashes it means the employee cannot attend all the meetings. Can you help central management to find it out  
   
// use this class structure

public class TimeInterval 
{
 int start;
 int end;
// use constructor, getter and setter methods as per requirement 
pubic boolean canAttendMeeting(TimeInterval [ ] tlarr)
{
	// set of statements 
}
 Hint:- Single Dimension array
*/
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TimeInterval arr[] = new TimeInterval[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = new TimeInterval(scan.nextInt(), scan.nextInt());

        }
        if(TimeInterval.canAttendMeeting(arr)) System.out.println("Yes");
        else System.out.println("No");
    }
}

class TimeInterval {
    int start;
    int end;

    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static boolean canAttendMeeting(TimeInterval[] arr) {
        int start[] = new int[arr.length];
        int end[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            start[i] = arr[i].start;
            end[i] = arr[i].end;
        }

        for(int i=0; i<arr.length-1; i++) {
            if(start[i+1] < end[i]) return false;
        }
        return true;
    }
}
