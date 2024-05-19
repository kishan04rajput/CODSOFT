import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Grade Calculator!");
        System.out.print("Enter total number of subjects: ");
        int noSubjects = 0;
        noSubjects = scanner.nextInt();

        int[] subjectMarks = new int[noSubjects];
        for (int i = 0; i < noSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + " marks: ");
            subjectMarks[i] = scanner.nextInt();
        }

        int totalMarks = noSubjects * 100;
        int studentMarks = 0;
        for (int i = 0; i < noSubjects; i++) {
            studentMarks = studentMarks + subjectMarks[i];
        }

        int gradeMarks = (100 * studentMarks) / totalMarks;

        System.out.println("Grade secured is: ");

        switch (gradeMarks / 10) {
            case 10:
            case 9:
                System.out.print("A");
                break;
            case 8:
                System.out.print("B");
                break;
            case 7:
                System.out.print("C");
                break;
            case 6:
            case 5:
            case 4:
                System.out.print("D");
                break;
            default:
                System.out.print("F");
        }
        scanner.close();
    }
}
