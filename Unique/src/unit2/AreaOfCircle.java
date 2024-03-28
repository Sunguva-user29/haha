 package unit2;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("कृपया पहिलो संख्या टाइप गर्नुहोस्: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("कृपया दोस्रो संख्या टाइप गर्नुहोस्: ");
        double number2 = scanner.nextDouble();

        // Find the largest number
        double largest = (number1 > number2) ? number1 : number2;

        // Display the result in Nepali
        System.out.println("दुई संख्यामध्ये ठूलो संख्या: " + largest);

        scanner.close();
    }
}
