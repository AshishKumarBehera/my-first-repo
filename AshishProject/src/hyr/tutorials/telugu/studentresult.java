package hyr.tutorials.telugu;
import java.util.Scanner;
public class studentresult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input:");
		int input = scanner.nextInt();
		if(input<35) {
			System.out.println("Student has failed");}
		else {
			if(input==35) {
				System.out.println("Student has passed");}
			else {
				if(input<=70) {
					System.out.println("Student has passed in third class");}
				else {
					if(input<=85) {
						System.out.println("Student has passed in second class");
					}
					else{
					System.out.println("Student has passed in first class");
					}
				}
			}
		}
	}

}
