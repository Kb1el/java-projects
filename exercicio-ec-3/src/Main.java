import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Informe dois números inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x % y == 0 || y % x == 0) {
			System.out.println("São múltiplos.");
		} else {
			System.out.println("Não são múltiplos.");
		}

		sc.close();
	}
}
