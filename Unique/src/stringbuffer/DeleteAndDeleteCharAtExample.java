public class DeleteAndDeleteCharAtExample {
    public static void main(String[] args)
    {
        StringBuffer s=new StringBuffer(" OOP in java ");
         System.out.println(s);
        s.delete(2, 7);
         System.out.println(s);
         StringBuffer s1=new StringBuffer(" BCA 3rd Semester");
         s1.deleteCharAt(2);
         System.out.println(s1);
    }
}
