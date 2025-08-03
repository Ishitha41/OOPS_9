package Project1;

public class DisplayDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  number (1 to 7): ");
        int day = scanner.nextInt();

        if (day < 1 || day > 7) {
            System.out.println(" Please enter  number between 1 and 7.");
        } else {
            String dayName;

            switch (day) {
                case 1:
                    dayName = "MONDAY";
                    break;
                case 2:
                    dayName = "TUESDAY";
                    break;
                case 3:
                    dayName = "WEDNESDAY";
                    break;
                case 4:
                    dayName = "THURSDAY";
                    break;
                case 5:
                    dayName = "FRIDAY";
                    break;
                case 6:
                    dayName = "SATURDAY";
                    break;
                case 7:
                    dayName = "SUNDAY";
                    break;
                default:
                    dayName = "Invalid"; 
       }
            System.out.println("The name of the day: " +dayName)
    }
}