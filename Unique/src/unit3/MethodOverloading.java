 package unit3;
import java.util.Scanner;

public class MethodOverloading {
    void area(int r) {
        System.out.println("Area of circle is " + 3.14 * r * r);
    }

    void area(int l, int b) {
        System.out.println("Area of rectangle is " + (l * b));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        MethodOverloading obj = new MethodOverloading();
        int length, breadth, radius;  
        System.out.println("Enter radius of circle: ");
        radius = sc.nextInt();  
        obj.area(radius);
        System.out.println("Enter length and breadth: "); 
        length = sc.nextInt();
        breadth = sc.nextInt();  
        obj.area(length, breadth);
    }
}
