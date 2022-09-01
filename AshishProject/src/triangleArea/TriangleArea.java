package triangleArea;
import java.util.*;
public class TriangleArea {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	float base,height,Area;
	System.out.println("Base is: ");
	base = sc.nextFloat();
	System.out.println("height is: ");
	height = sc.nextFloat();
	Area = ((base*height)/2);
	System.out.println("The Area of Triangle is: " + Area);
}
}
