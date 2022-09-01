package hyr.tutorials.telugu;

import java.util.Scanner;

public class Assignment1 {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Number");
		int inputnumber = scanner.nextInt();
		if(inputnumber%2 == 0){
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is odd");
		}
	}
}