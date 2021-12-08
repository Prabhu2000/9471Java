Write a Java program to sort a numeric array and a string array.

Solution-->

import java.util.Arrays;
public class Array1{
public static void main(String[] args){
int n[]={5,8,7,3,2,1};
String m[]={"b","g","d","h","l"};
for(int i=0;i<n.length;i++){
Arrays.sort(n);
System.out.print("sorted number:" + n[i]);}
for(int j=0;j<m.length;j++){
Arrays.sort(m);
System.out.print("sorted string:" + m[j]);}
}
}
