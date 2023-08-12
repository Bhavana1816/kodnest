import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		CalculatorApp2 c = new CalculatorApp2();
		c.add(a,b);
		c.sub(a,b);
		c.mul(a,b);
		c.div(a,b);
		c.mod(a,b);
	}

}
