5. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

Solution-->


import java.util.Scanner;

public class Table{

public static void main(String[] args){

int i=1,b;

Scanner sc= new Scanner(System.in);

System.out.println("Enter your number");

b= sc.nextInt();

for(i=1;i<=10;i++)

System.out.println( b + "*"+i+"=" +b*i);

}
}
