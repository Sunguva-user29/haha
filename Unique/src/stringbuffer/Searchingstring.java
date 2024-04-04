package stringbuffer;

import javax.lang.model.util.ElementScanner14;

public class Searchingstring {
    public static void main(String[] args)
    {
        String s="BCA 3RD Semester ";
        int id =s.indexOf("Semester");
        if (id==-1)
        System.out.println("Semester not found ");
        else 
        System.out.println("Found at index "+id);
         
    }
}
