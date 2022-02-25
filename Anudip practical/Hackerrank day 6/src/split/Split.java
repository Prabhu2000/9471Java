package split;
import java.util.*;
public class Split {
	public static void main(String[] args) {
		String n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your string");
			n=sc.nextLine();
		}
        String words[]=n.split(" ",2);
		for(String b:words) {
			System.out.println(b);
		}
	}
}
