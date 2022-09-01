package stringpractice;

public class StringPractice {

	public static void main(String[] args) {
		String str1 = "programmer@gmail.com";
		String username = str1.substring(0, 10);
		String domainname = str1.substring(11);
		System.out.println("Username: "+username);
		System.out.println("Domainname: "+domainname);
		System.out.println(str1.matches(".*gmail.*"));

	}

}
