package empty;
import java.util.ArrayList;
public class Empty {
		public static void main(String[] args) {
			ArrayList <String> List1=new ArrayList<String>();
			List1.add("1");
			List1.add("2");
			List1.add("3");
			System.out.println("ArrayList1 before clear="+List1);
			List1.clear();
			System.out.println("ArrayList1 after clear="+List1);
			ArrayList<String> List2=new ArrayList<String>();
			List2.add("aditya");
			List2.add("Laxman");
			List2.add("Prabhu");
			System.out.println("ArrayList1 before removeAll="+List2);
			List2.removeAll(List2);
			System.out.println("ArrayList1 after removeAll="+List2);
		}

	}
