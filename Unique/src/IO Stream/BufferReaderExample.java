import java.io.*;
public class BufferReaderExample {
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader reader =new BufferedReader(
            new InputStreamReader(System.in));
            System.out.println("NAME: ");
            String name=reader.readLine();
            System.out.println("Name: "+name);a
    }
}
