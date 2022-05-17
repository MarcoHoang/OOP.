import java.util.Scanner;

public class displayANumberOfTheDayOfTheMonth {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int year = keyboard.nextInt();

        System.out.println("Please enter a month: ");
        int month = keyboard.nextInt();

        while (month > 12 | month < 1) {
            System.out.println("Please enter again a month");
            month = keyboard.nextInt();
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    System.out.println("29 days");
                else
                    System.out.println("28 days");
                break;
        }
    }
}
