

package unit2;
import java.util.Scanner;
public class ArrayExample {
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.println("Size of Array: ");
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the array element: ");
arr[i]=sc.nextInt();
}
System.out.println("\n Displaying array element");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}

}
