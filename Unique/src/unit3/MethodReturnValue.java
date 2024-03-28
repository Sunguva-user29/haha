 
package unit3;
 import java.util.Scanner;
public class MethodReturnValue {
int sum(int a,int b){
return a+b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x,y;
MethodReturnValue obj =new MethodReturnValue ();
System.out.println("Enter two numbers:");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("sum  :" +obj.sum(x,y)); 4


}

}
