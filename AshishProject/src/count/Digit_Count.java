package count;
import java.util.Scanner;
public class Digit_Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int count=0;
		while(n>0){
			n=n/10;
			count++;
			scan.close();
		}
System.out.println(count);
	}

}
