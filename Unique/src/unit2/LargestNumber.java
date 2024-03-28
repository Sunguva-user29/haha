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
public class LargestNumber {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter two numbers :");
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
System.out.println(a+" is larger  than "+b);
else
System.out.println(b+" is larger than "+a);
}

}
