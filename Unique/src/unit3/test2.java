
package unit3;
public class test2 {
int a;
int b;
test2()
{
this(10,20);
System.out.println(" Inside default Constructor\n");
}
test2(int a ,int b)
{
//Parameterized constructor
this.a=a;
this.b=b;
System.out.println(" a="+a+"b="+b);

}
public static void main(String[] args)
{
test2 object= new test2();
}
}
