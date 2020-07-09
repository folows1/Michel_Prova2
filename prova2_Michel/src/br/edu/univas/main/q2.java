package br.edu.univas.main;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int i = -1;
		System.out.println("Digite números de 1 a 7");
		int notas[] = new int[10000000];
		do {
			i++;
			notas[i] = l.nextInt();
		} while (notas[i] != 0);
		for (int j = 0; j < i; j++) {
			if (notas[j] == 1) {
				System.out.println("DÓ");
			} else if (notas[j] == 2) {
				System.out.println("RÉ");
			} else if (notas[j] == 3) {
				System.out.println("MI");
			} else if (notas[j] == 4) {
				System.out.println("FA");
			} else if (notas[j] == 5) {
				System.out.println("SOL");
			} else if (notas[j] == 6) {
				System.out.println("LA");
			} else if (notas[j] == 7) {
				System.out.println("SI");
			}
		}
		l.close();

	}
}
