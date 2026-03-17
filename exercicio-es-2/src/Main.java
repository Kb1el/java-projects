import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, pi, area;
	
		x = sc.nextDouble();
		y = 2;
		pi = 3.14159;
		area = pi * (Math.pow(x, y));
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	
	}

}
