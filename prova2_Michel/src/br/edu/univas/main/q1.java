package br.edu.univas.main;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		float contasA[] = new float[12];
		float contasB[] = new float[12];
		float maiorA = 0;
		float maiorB = 0;
		float menorA = 0;
		float menorB = 0;
		float mediaA = 0;
		float mediaB = 0;
		System.out.println("Digite as 12 contas do apartamento A: ");
		for (int i = 0; i < 12; i++) {
			contasA[i] = l.nextFloat();
			if (i == 0) {
				maiorA = contasA[i];
				menorA = contasA[i];
			} else if (contasA[i] > maiorA) {
				maiorA = contasA[i];
			} else if (contasA[i] < menorA) {
				menorA = contasA[i];
			}
			mediaA = mediaA + contasA[i];
		}
		System.out.println("Digite as 12 contas do apartamento B: ");
		for (int i = 0; i < 12; i++) {
			contasB[i] = l.nextFloat();
			if (i == 0) {
				maiorB = contasB[i];
				menorB = contasB[i];
			} else if (contasB[i] > maiorB) {
				maiorB = contasB[i];
			} else if (contasB[i] < menorB) {
				menorB = contasB[i];
			}
			mediaB = mediaB + contasB[i];
		}
		l.close();
		System.out.println("Apartamento A");
		System.out.println("Menor conta: " + menorA);
		System.out.println("Maior conta: " + maiorA);
		System.out.println("Media: " + (mediaA / 12));
		System.out.println("Apartamento B");
		System.out.println("Menor conta: " + menorB);
		System.out.println("Maior conta: " + maiorB);
		System.out.println("Media: " + (mediaB / 12));
	}
}
