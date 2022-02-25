package empty;
import java.util.*;
public class Empty {
		public static void main(String[] args) {
			ArrayList <String> List1=new ArrayList<String>();
			List1.add("1");
			List1.add("2");
			List1.add("3");
			System.out.println("ArrayList1 before clear="+List1);
			List1.isEmpty();
			System.out.println("ArrayList1 after clear="+List1);
			ArrayList<String> List2=new ArrayList<String>();
			List2.add("");
			List2.add("");
			List2.add("");
			System.out.println("ArrayList1 before removeAll="+List2);
			List2.isEmpty();
			System.out.println("ArrayList1 after removeAll="+List2);
		}

	}

