 

package unit2;
import java.util.Scanner; 
public class PrimeComposite {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,factor=0;
System.out.println("Enter a number: ");
n=sc.nextInt();
for(i=0;i<=n;i++){
if(n%i==0)
factor++;
}
if(factor==2)
System.out.println(n+"is prime");
else
System.out.println(n+"is composite");

}

}
