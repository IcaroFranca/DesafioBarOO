package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill tab = new Bill();
		
		System.out.print("Sexo: ");
		tab.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		tab.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		tab.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		tab.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", tab.feeding());
		
		if (tab.feeding() > 30) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", tab.cover());
		}
		
		System.out.printf("Ingresso = R$ %.2f%n", tab.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", tab.total());
		
		sc.close();
	}

}
