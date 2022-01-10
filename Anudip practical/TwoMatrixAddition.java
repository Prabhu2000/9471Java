import java.util.Scanner;
public class Add{
public static void main(String[] args){
int a,b;
Scanner sc= new Scanner(System.in)
System.out.println("Enter your size of matrix 1");
int a[][]=new int[row][col]
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter your size of matrix 2")
int b[][]=new int[row][col]
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
b[i][j]=sc.nextInt();
}
}
System.out.println(Enter your element of matrix 1);
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
System.out.println(a[i][j]+"");
}
System.out.println("");
}
System.out.println(Enter your element of matrix 2);
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
System.out.println(b[i][j]+"");
}
System.out.println("");
}
int c[i][j]=new int [i][j];
System.out.println("addition of two matrix");
c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]+"");
}
System.out.println("");
}
}
}


