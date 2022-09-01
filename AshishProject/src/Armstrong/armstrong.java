package Armstrong;
import java.util.Scanner;

public class armstrong {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = scan.nextInt();
	int sum=0;
	int r;
	int m=n;
	while(n>0)
	{
	     r=n%10;
		sum=sum+r*r*r;
		n=n/10;
		}
	if(sum==m) {
	System.out.println("This number is an armstrong number");
	}
	else {
		System.out.println("This is not an armstrong number");
	}
	
}
}
