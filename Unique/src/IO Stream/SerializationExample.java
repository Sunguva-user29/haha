import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args){
        Student s =new Student();
        s.rollno=5;
        s.name="Avishar";
        try{
            FileOutputStream fout=new FileOutputStream("E:\\student.ser");
            ObjectOutputStream out=new ObjectOutputStream(fout);
           out.writeObject(s);
           out.close();
           fout.close();
           System.out.println("Serialized data is saved "); 
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
    
}
