package Project1;

public class Multitable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of the multiplication table: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
