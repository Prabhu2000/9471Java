import java.util.Scanner;


public class Program {
public static void main(String[] args) {
int days,hours,minutes,seconds;
Scanner scanner = new Scanner(System.in);
System.out.println(" days are");
days = scanner.nextInt();
hours= days*24;
System.out.println(hours+"hours");
System.out.println("which are hours");
hours = scanner.nextInt();
minutes=hours*60;
System.out.println(minutes+ "minutes");
System.out.println("which are minutes" );
minutes= scanner.nextInt();
seconds = minutes*60;
System.out.println( seconds+ "seconds" );

		
	}
}
