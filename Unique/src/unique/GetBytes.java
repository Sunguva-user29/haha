package unique;

public class GetBytes {
    public static void main(String[] args){
        String s="ABC DEF";
        byte[] b=s.getBytes();
        for(byte i:b)
        {
            System.out.println(i);
        }
    }
}
