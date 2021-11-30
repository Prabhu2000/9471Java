9.Write a Java program to reverse a word. 
Sample Output:

Input a word: dsaf
Reverse word: fasd
Click me to see the solution


Solution-->

import java.util.Scanner;
public class Reverse{
public static void main(String[] args){
int len,i;
System.out.println("Enter your string");
String word=new Scanner(System.in).next();
len=word.length();
String reverseword="";
for(i=len-1;i>=0;i--){
reverseword+=word.charAt(i);
}
System.out.println(reverseword);
}
}
