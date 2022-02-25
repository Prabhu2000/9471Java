package join;
import java.util.ArrayList;
public class Join {
	public static void main(String[] args) {
		ArrayList <String> List1=new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		System.out.println("ArrayList1="+List1);
		ArrayList<String> List2=new ArrayList<String>();
		List2.add("aditya");
		List2.add("Laxman");
		List2.add("Prabhu");
		System.out.println("ArrayList1="+List2);
		List1.addAll(List2);
		System.out.println("joinig array="+List1);
	}

}
