package unique.unit5;

public class NestedTryCatch {
    public static void main(String[] args){
        try{
            try{
                System.out.println("Going to devide ");
                int b=39/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[]=new int [5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e)
        {
            System.out.println("HANDALED");
        }
    }
}
