import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();

		//your code goes here
int pay;
for(int i=1; i<=3;i++)
{
    pay = 10*amount/100;
    amount = amount - pay;
}
System.out.println(amount);

}
	}
