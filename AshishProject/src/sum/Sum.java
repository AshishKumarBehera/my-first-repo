package sum;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum,n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is:"+sum);
		sc.close();

	}

}
