 package unit3;

public class StaticMethod {
    static int rollno;
    static String name;
    static String subject;

    StaticMethod(int r, String n, String s) {
        rollno = r;
        name = n;
        subject = s;
    }

    static void display() {
        System.out.println("\n RollNo:" + rollno);
        System.out.println("\n NAME:" + name);
        System.out.println("\n SUBJECT:" + subject);
    }

    public static void main(String args[]) {
        StaticMethod obj = new StaticMethod(1, "anish", "DSA");
        display();
    }
}
