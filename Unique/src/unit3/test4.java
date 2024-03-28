package unit3;
public class test4 {
int a ;
int b;
test4()
{
a=10;
b=20;//default constucto
}
// method that recieves "this" keyword as paramemter
void display(test4 obj)
{
System.out.println("a=" +obj.a+"+b"+obj.b);
}
void get()
{
display (this);

}
public static void main(String[] args)
{
test4 object=new test4();
object.get();
}
}
