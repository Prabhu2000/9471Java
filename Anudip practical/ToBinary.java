import java.util.Scanner;
Class Converter{
Public static String toBinary(int num){
String binary="";
while(num>0){
binary =(num%2)+num;
num/=2;
}
return binary;
}
}
public class Solution{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
x = sc.nextInt();
System.out.println(Converter.toBinary(x));
}
}
