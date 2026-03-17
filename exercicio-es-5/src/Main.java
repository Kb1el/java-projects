import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade1, quantidade2;
		double valor1, valor2, total;
	
		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = (quantidade1 * valor1) + (quantidade2 * valor2);

		System.out.printf("VALOR A PAGAR: = U$ %.2f%n", total);
		
		sc.close();
	
	}

}
