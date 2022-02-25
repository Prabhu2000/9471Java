package sudocode;
import java.util.Scanner;
public class Sentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String w;
		System.out.println("Enter Your String");
		w=sc.nextLine();
		System.out.println("your string:"+w);
		String words[]=w.split(" ");
		for(String w1:words) {
			System.out.println(w1);
		}
	}
}
