import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day (DD): ");
		int day = sc.nextInt();
		System.out.print("Enter month (MM): ");
		int month = sc.nextInt();
		System.out.print("Enter year (YY): ");
		int year = sc.nextInt();
		System.out.println(day + "/" + month + "/" + year);
	}
}