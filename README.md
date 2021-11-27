1. When the value of count becomes 7 or 15, the continue statement plays its role and skip their execution but for other values of the count, the loop will run smoothly.
consider  i =20

Solution-->
public class Continue{
public static void main(String[] args){
for(int i=1;i<=20;i++)
if(i==7||i==15){
continue;
}
System.out.println(i);
}
}
}
