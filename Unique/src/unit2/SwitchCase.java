 package unit2;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter day of week: ");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
