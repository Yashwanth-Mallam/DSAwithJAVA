import java.util.Scanner;

public class MusicFestivalAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for Day 1's attendance
        System.out.print("Enter the attendance for Day 1: ");
        int day1Attendance = scanner.nextInt();
        
        // Calculate attendance for Day 2 and Day 3
        int day2Attendance = day1Attendance * 2;
        int day3Attendance = (int) (day1Attendance * 0.6);
        
        // Output the attendance for each day
        System.out.println("Day 1: " + day1Attendance + " people");
        System.out.println("Day 2: " + day2Attendance + " people");
        System.out.println("Day 3: " + day3Attendance + " people");
        
        // Close the scanner
        scanner.close();
    }
}
