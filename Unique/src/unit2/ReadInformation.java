 package unit2;
import java.util.Scanner; 

public class ReadInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter roll number:");
        int rollno = sc.nextInt();
        
        System.out.println("Enter name:");
        String name = sc.next();
        
        System.out.println("Enter gender:");
        char gender = sc.next().charAt(0);
        
        System.out.println("Enter phone number:");
        long phno = sc.nextLong();
      
        System.out.println("Roll number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phno);
        
        sc.close(); 
    }
}
