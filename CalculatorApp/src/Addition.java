import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for addition");
		int a = scan.nextInt();
		System.out.println("enter another a value for double");
		double b = scan.nextDouble();
		double c = a+b;
		System.out.println("Addition" + (a+b));
		
	}

}
