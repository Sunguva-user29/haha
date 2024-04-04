package unique;

public class GetCharsExample {
    public static void main(String[] args){
        String s1="Object Oreinted Programmin in Java";
        int start=2;
        int end=8;
        char s2[]=new char[end-start];
        s1.getChars(start,end,s2,0);
        System.out.println(s2);
    }
    
}
