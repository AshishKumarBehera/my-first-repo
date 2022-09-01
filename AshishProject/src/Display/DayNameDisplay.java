package Display;
import java.util.Scanner;
public class DayNameDisplay {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		if(num==1) {
			System.out.println("Name of the day is Monday");
		}
		else if(num==2) {
			System.out.println("Name of the day is Tuesday");
		}
		else if(num==3) {
			System.out.println("Name of the day is Wednesday");
		}
		else if(num==4) {
			System.out.println("Name of the day is Thursday");
		}
		else if(num==5) {
			System.out.println("Name of the day is Friday");
		}
		else if(num==6) {
			System.out.println("Name of the day is Saturday");
		}
		else if(num==7) {
			System.out.println("Name of the day is Sunday");
		}
		else {
			System.out.println("It is an invalid number");
		}
		sc.close();

	}

}
