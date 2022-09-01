package CuboidArea;
import java.lang.*;
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		int length,breadth,height,topArea,bottomArea,frontArea,backArea,leftArea,rightArea;
		int totalArea,volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("length is: ");
		length=sc.nextInt();
		System.out.println("breadth is: ");
		breadth=sc.nextInt();
		System.out.println("height is: ");
		height=sc.nextInt();
		frontArea=length*height;
		backArea=length*height;
		topArea=length*breadth;
		bottomArea=length*breadth;
		rightArea=breadth*height;
		leftArea=breadth*height;
		totalArea=(topArea+bottomArea+frontArea+backArea+leftArea+rightArea);
		volume = length*breadth*height;
		System.out.println("The total area of cuboid is: "+totalArea);
		System.out.println("Volume of Cuboid is: "+volume);

	}

}
