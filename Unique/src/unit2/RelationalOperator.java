/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit2;
import java.util.Scanner;

/**
 *
 * @author BCA user-29
 */
public class RelationalOperator {

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter two numbers: ");
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
System.out.println( a +"is Greater than " +b);
else if(a<b)
System.out.println(  b +  " is Greater than " +a);
else
System.out.println("Both are equal");
sc.close();

}

}
