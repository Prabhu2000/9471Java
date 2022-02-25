package swap;
import java.util.*;
public class Swap {
	public static void main(String[] args) {
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your two number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before sewaping"+a+" "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("after swaping="+a+" "+b);
	}
	

}
