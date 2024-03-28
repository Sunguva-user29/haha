package unique.unit5;

public class MultipleCatchBlock{
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[2]=6/0;
            System.out.println(a[2]);
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero you stupid ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Indexoutofbound error occurs ");
        }
    
    }  
}
 