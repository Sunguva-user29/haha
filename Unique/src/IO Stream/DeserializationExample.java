import java.io.*;
public class DeserializationExample {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Student s=null;
        try{
            FileInputStream fin =new FileInputStream("E:\\student.ser");
            ObjectInputStream in =new ObjectInputStream(fin);
            s=(Student)in.readObject();
            System.out.println("RollNo="+s.rollno);
            System.out.println("NAME="+s.name);
            in.close();;
            fin.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
}
