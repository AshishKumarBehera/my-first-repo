package Relational;
import java.util.Scanner;
public class Relational {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = "Ashish";
	String name;
	System.out.println("Enter name: ");
	name = sc.nextLine();
	if(name.equalsIgnoreCase(str)) {
System.out.println("Yes,both the names are same!!!");
	}
	else {
		System.out.println("No,both are different names.");
	}
    sc.close();
}
}