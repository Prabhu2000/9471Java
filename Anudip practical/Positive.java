6. Write a Java program to get a number from the user and print whether it is positive or negative. 


Test Data
Input number: 35
Expected Output :
Number is positive

Solution-->

import java.util.Scanner;
public class Positive{
public static void main(String[] args){
int b;
Scanner sc= new Scanner(System.in);
b=sc.nextInt();
System.out.println("Enter your number");
if(b>0){
System.out.println("number is positive");
}
else if(b<0){
System.out.println("number is negative");
}
else{
System.out.println("equal to zero ");
}
}
}
