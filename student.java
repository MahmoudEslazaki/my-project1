import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberstudent = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= numberstudent; i++) {
            System.out.println("\nStudent number " + i);
            System.out.print("Enter student name: ");
            String name = input.nextLine();
            System.out.print("Enter score 1: ");
            double score1 = input.nextDouble();
            System.out.print("Enter score 2: ");
            double score2 = input.nextDouble();
            System.out.print("Enter score 3: ");
            double score3 = input.nextDouble();
            input.nextLine();
            double average = calculateAverage(score1, score2,score3);
            String grade = getGrade(average);
            System.out.println("Name: " + name);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
        }
        input.close();
    }
    public static double calculateAverage(double s1, double s2, double s3) {
        return (s1 + s2 + s3) / 3.0;
    }
    public static String getGrade(double average) {
        if (average >= 85)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 50)
            return "C";
        else
            return "F";
    }
}
