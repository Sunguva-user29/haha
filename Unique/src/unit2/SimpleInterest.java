


package unit2;

import java.util.Scanner;
public class SimpleInterest {
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int principle;
float rate,time,si;
System.out.println("Enter principle rate and time");
principle=sc.nextInt();
rate=sc.nextFloat();
time=sc.nextFloat();
si=(principle*time*rate)/100;
System.out.println("Simple interest="+si);

}

}
