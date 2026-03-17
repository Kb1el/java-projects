import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
		
		System.out.println("SOMA = " + z);
		
		sc.close();
	
	}

}
