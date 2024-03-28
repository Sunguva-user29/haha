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
public class OddEven {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(n%2==0)
System.out.println(n+"is even");
else
System.out.println(n+"is odd");
}

}
