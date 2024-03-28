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
public class ConditionalOperator {

public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int a,b,large;
System.out.println("Enter two numbers: ");
a=sc.nextInt();
b=sc.nextInt();
large=a>b?a:b;
System.out.println("Largest value:  "+large);
}


}
