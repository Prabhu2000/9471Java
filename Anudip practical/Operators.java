4. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

Solution-->

import java.util.Scanner;

public class TwoNo{

public static void main(String[] args){

int a,b,sum,sub,mul,div,mod;

Scanner sc= new Scanner(System.in);

System.out.println("Enter your first number");

a= sc.nextInt();

System.out.println("Enter your second number");

b= sc.nextInt();

sum=a+b;
sub=a-b;
mul=a*b;
div=a/b;
mod=a%b;
System.out.println("Sum of two number=" + sum);

System.out.println("sub of two number=" + sub);

System.out.println("mul of two number=" + mul);

System.out.println("div of two number=" + div);

System.out.println("mod of two number=" + mod);

}
}
