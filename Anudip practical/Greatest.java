7.Take three numbers from the user and print the greatest number. 

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87

Solution-->

import java.util.Scanner;
public class Greatest{
Public static void main(String[] args){
int a,b,c;
Scanner sc= new Scanner(System.in);
System.out.println("Enter your first number");
a=sc.nextInt();
System.out.println("Enter your second number");
b=sc.nextInt();
System.out.println("Enter your third number");
c=sc.nextInt();
if(a>b && a>c)
System.out.println("the greatest" + a);
else if(a<b && b>c)
System.out.println("the greatest" + b);
else if(a<c && b<c)
System.out.println("the greatest" + c);
else
System.out.println("number is same");
}
}


