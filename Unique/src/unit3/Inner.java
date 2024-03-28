 package unit3;

 class Outer { 
    int x = 5;

    private  class Inner {
        void display() {
            System.out.println("Value of x = " + x);
        }
    }

    void show() {
        Inner obj = new Inner();
        obj.display();
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.show();
    }
}
