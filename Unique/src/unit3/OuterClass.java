 package unit3;

public class OuterClass {
    static class InnerClass {
        public void display() {
            System.out.println("Inside Nested class");
        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.display();
    }
}
