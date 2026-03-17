import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, horast;
		double valorh, salario;
	
		number = sc.nextInt();
		horast = sc.nextInt();
		valorh = sc.nextDouble();
		
		salario = horast * valorh;

		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		sc.close();
	
	}

}
