import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		salario = sc.nextDouble();
		
		if (salario >= 2000.01 && salario <= 3000.00){
			imposto = ((salario - 2000.00) * 8 / 100);
		} else if (salario >= 3000.01 && salario <= 4500.00){
			imposto = ((1000 * 8 / 100) + (salario - 3000) * 18 / 100);
		} else {
			imposto = ((1000 * 8 / 100) + (1500 * 18 / 100) + ((salario - 4500) * 28 / 100));
		}
		
		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		} else {
			System.out.printf("O valor de imposto a ser pago é: %.2f%n", imposto);
		}
		
		sc.close();
	}
}