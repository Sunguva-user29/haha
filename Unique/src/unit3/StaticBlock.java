 
package unit3;
 
public class StaticBlock {
static int rollno;
static String name;
static String subject;
static
{
rollno=1;
name="Avishar";
subject="OOp in java";
}
void display()
{
System.out.println("RollNo:"+rollno);
System.out.println("NAME:"+name);
System.out.println("subject:"+subject);
}
public static void main (String args[]){
StaticBlock obj=new StaticBlock();
obj.display();

}

}
