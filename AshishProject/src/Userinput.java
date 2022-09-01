import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.printf("Hey %s,how are you?",name);
		String status = scanner.nextLine();
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		System.out.print("Thankyou for the information");
		scanner.close();
	}

}
