package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		int i = 0, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			i = ler.nextInt();
			soma = soma + i;
		} while(i != 0);
		
		System.out.println("A soma dos números é: " + soma);
		
		ler.close();
	}

}
