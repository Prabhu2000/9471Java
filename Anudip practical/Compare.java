8. Write a Java program to compare two numbers. Go to the editor
Input Data:


Solution-->

import java.util.Scanner;
public class Compare{
public static void main( String args[] ){       
Scanner input = new Scanner(System.in);
int num1,num2;
System.out.print( "Input first integer: " );      
num1 = input.nextInt(); 
System.out.print( "Input second integer: " );     
num2 = input.nextInt();             
if ( num1 == num2 )           
System.out.printf( "%d == %d\n", num1, num2 );  
if ( num1 != num2 )          
System.out.printf( "%d != %d\n", num1, num2 );  
if ( num1 < num2 )          
System.out.printf( "%d < %d\n", num1, num2 );  
if ( num1 > num2 )          
System.out.printf( "%d > %d\n", num1, num2 );  
if ( num1 <= num2 )          
System.out.printf( "%d <= %d\n", num1, number2 );  
if ( num1 >= num2 )          
System.out.printf( "%d >= %d\n", num1, num2 );  
}
}
  
