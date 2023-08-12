import java.util.Scanner;
public class CalculatorApp {
	    static void Addition(){
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter 2 number for addition");
	        int a=scan.nextInt();
	        int b=scan.nextInt();
	        System.out.println("Sum =" + (a+b));
	    }

	    static void Subtraction(int a,int b){
	        System.out.println("Difference =" + (a-b));
	    }

	    static int Multiplication(){
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter 2 number for Multiplication");
	        int a=scan.nextInt();
	        int b=scan.nextInt();
	        return a*b;
	    }

	    static double Division(double a,double b){
	        return a/b;
	    }

	    static void Modulo(){
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter 2 number for Modulo");
	        int e=scan.nextInt();
	        int f=scan.nextInt();
	        System.out.println("Modulo =" + e%f);
	    }

	    static void Avg(){
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter 2 number for Avg");
	        double g=scan.nextDouble();
	        double h=scan.nextDouble();
	        System.out.println("A =" + ((g+h)/2));
	    }
	    
	    public static void main(String[] args){
	        Scanner scan=new Scanner(System.in);
	        Addition();

	        System.out.println("Enter 2 number for Subtraction");
	        int a=scan.nextInt();
	        int b=scan.nextInt();
	        Subtraction(a,b);

	        int product=Multiplication();
	        System.out.println(product);
	        
	        System.out.println("Enter 2 number for Division");
	        double c=scan.nextInt();
	        double d=scan.nextInt();
	        double Re=Division(c,d);
	        System.out.println(Re);

	        Modulo();
	        Avg();
	    }
}
