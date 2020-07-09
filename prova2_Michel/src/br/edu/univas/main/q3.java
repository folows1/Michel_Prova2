package br.edu.univas.main;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		float folhaA = 0;
		float folhaF;
		float salarios[] = new float[150];
		System.out.println("Leitura dos 150 salários: ");
		for (int i = 0; i < 150; i++) {
			salarios[i] = l.nextFloat();
			folhaA = folhaA + salarios[i];
		}
		folhaF = folhaA * 1.15f;
		l.close();
		System.out.println("Valor da folha salárial antes do aumento: " + folhaA);
		System.out.println("Com o aumento de 15%: " + folhaF);
	}
}
