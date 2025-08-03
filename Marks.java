package Project1;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks (0-100): ");
        int markss = scanner.nextInt();
        if (markss < 0 || markss > 100) {
            System.out.println("Invalid marks");
        } else {
            char grade;
            if (markss >= 90) {
                grade = 'A';
            } else if (markss >= 75) {
                grade = 'B';
            } else if (markss >= 55) {
                grade = 'C';
            } else if (markss >= 35) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade);
        
    }
}
