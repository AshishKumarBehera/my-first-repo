package palindrome;
import java.util.Scanner;
public class Palindrome_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int r;
		int rev=0;
		int m=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==m) {
			System.out.println("It's a palindrome!!!");
		}
		else {
			System.out.println("It's not a palindrome!!!");
		}
		sc.close();
	}

}
