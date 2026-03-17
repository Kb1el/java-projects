import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, P1, P2, P3;
		
		cod = sc.nextInt();
		P1 = 0;
		P2 = 0;
		P3 = 0;
		
		while (cod != 4) {
			if (cod == 1) {
				P1 = P1 + 1;
			} else if (cod == 2) {
				P2 = P2 + 1;
			} else if (cod == 3) {
				P3 = P3 + 1;
			}
			
			cod = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado!");
		
		System.out.println("Alcool: " + P1);
		System.out.println("Gasolina: " + P2);
		System.out.println("Diesel: " + P3);
		
		sc.close();
		
	}

}
