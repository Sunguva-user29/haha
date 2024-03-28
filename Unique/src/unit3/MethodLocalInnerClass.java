package unit3;
public class MethodLocalInnerClass {
    void show(){
        int x=5;
        class Inner{
            void display(){
                System.out.println("value of X "+x);
            }
        }
        Inner ob=new Inner();
        ob.display();
    }
    public static void main(String args[])
    {
        MethodLocalInnerClass obj= new MethodLocalInnerClass();
        obj.show();
    }
}
