package Multiplication;
import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
		sc.close();

	}

}
