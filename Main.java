package lab;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date in the format yyyy.mm.dd: ");
        Date date1 = new Date(scanner.nextLine());

        System.out.print("Enter the second date in the format yyyy.mm.dd: ");
        Date date2 = new Date(scanner.nextLine());

        System.out.println("Date 1: " + date1.toString());
        System.out.println("Date 2: " + date2.toString());

        System.out.println("Days between date 1 and date 2: " + date1.daysBetween(date2));

        int daysToAdd = 10;
        date1.addDays(daysToAdd);
        System.out.println("Date 1 after adding " + daysToAdd + " days: " + date1.toString());

        int daysToSubtract = 5;
        date2.subtractDays(daysToSubtract);
        System.out.println("Date 2 after subtracting " + daysToSubtract + " days: " + date2.toString());

        System.out.println("Is year " + date1.getYear() + " a leap year? " + date1.isLeapYear());
        System.out.println("Is year " + date2.getYear() + " a leap year? " + date2.isLeapYear());

        System.out.println("Comparison of date 1 and date 2: " + date1.compare(date2));
    }
}
