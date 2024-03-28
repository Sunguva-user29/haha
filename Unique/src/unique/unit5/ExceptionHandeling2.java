package unique.unit5;

public class ExceptionHandeling2 {
    public static void main(String args[])
    {
        try{
            int a[]={2,3,4,5};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
