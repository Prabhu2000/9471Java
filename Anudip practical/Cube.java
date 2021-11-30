Write a program in Java to display the cube of the number upto given an integer. Go to the editor

Test Data
Input number of terms : 4
Expected Output :
                                             
Number is : 4 and cube of 4 is : 64

Solution-->
import java.util.Scanner;

public class Cube{

public static void main(String[] args){

int cube,b;

Scanner sc= new Scanner(System.in);

System.out.println("enter your number:");

b=sc.nextInt();

cube=b*b*b;

System.out.println(cube);

}

}
