import java.util.*;
public class Arithmatic {
	static int sum(int a, int b, int c) {
	  return a+b+c;
	}
	static int avg(int a, int b, int c) {
		return a+b+c/3;
	}
	static int max(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("max is="+a);
		}
		if(a<b && b>c) {
			System.out.println("max is="+b);
		}
		if(a<c && b<c) {
			System.out.println("max is="+c);
		}
		return c;
	}
		public static void main(String[] args) {
			int a,b,c;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter youre number");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			System.out.println("sum is="+sum(a,b,c));
			System.out.println("avg is="+avg(a,b,c));
			if(a<b && a<c) {
					System.out.println("min is="+a);
				}
				if(a>b && b<c) {
					System.out.println("min is="+b);
				}
				if(a>c && b>c) {
					System.out.println("min is="+c);
					
				}	
				max(a,b,c);
				min(a,b,c);
		
		
		
		
		}
		private static void min(int a, int b, int c) {
			// TODO Auto-generated method stub
			
		}
	}
