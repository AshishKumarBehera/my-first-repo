

package triangleArea;
import java.lang.*;
import java.util.Scanner;
public class Expression {

	public static void main(String[] args) {
		int a,b,c;
		float s;
		double area;
		System.out.println("Enter the sides: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		s = (a+b+c)/2f;
		System.out.println("The surface area is : "+s);
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is : "+area);

	}

}
