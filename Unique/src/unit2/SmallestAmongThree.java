 package unit2;
import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a < b) {
            if (a < c)
                System.out.println(a + " is Smallest");
            else
                System.out.println(c + " is Smallest");
        } else {
            if (b < c)
                System.out.println(b + " is Smallest");
            else
                System.out.println(c + " is Smallest");
        }
    }
}
