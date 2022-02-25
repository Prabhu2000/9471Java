package solution;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your no");
		n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}
