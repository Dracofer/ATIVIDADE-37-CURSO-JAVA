package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		double mVelha = 0;
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da "+ "%d" + "a pessoa:%n",i + 1);
			System.out.print("Nome:");
			String name = sc.nextLine();
			System.out.print("Idade:");
			double idade = sc.nextDouble();
			vect[i] = new Product(name, idade);
			
		}
		for (int i = 0; i < n; i++) {
			if(vect[i].getIdade() > mVelha) {
				mVelha = vect[i].getIdade();
			}
		}
		for (int i = 0; i < n; i++) {
			if(vect[i].getIdade() == mVelha) {
				System.out.print("PESSOA MAIS VELHA: ");
				System.out.print(vect[i].getName());
			}
		}
		sc.close();
	}
}
