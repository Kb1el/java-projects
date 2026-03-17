package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		People[] vect = new People[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();

			System.out.printf("Dados da %da pessoa: \n", i + 1);

			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Altura: ");
			double height = sc.nextDouble();

			vect[i] = new People(name, age, height);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
		}

		double avg = sum / vect.length;

		System.out.printf("\nAltura média: %.2f%n", avg);

		int contador = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				contador++;
			}
		}

		double per = (contador * 100.0) / vect.length;

		System.out.printf("\nQuantidade de pessoas com menos de 16 anos: %.1f%%%n", per);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();

	}

}