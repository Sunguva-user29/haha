package unique.unit5;

public class NumberFormatExceptionExample {
    public static void main(String args[])

    {
        try{
            int a=Integer.parseInt("Avishar dada");
        }
        catch(NumberFormatException e){
            System.out.println("Number format Exception ");


        }

    }
    
}
