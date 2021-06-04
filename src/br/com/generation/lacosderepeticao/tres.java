package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade = 0, totalmais = 0, totalmenos = 0;
		
		while(idade != 99) {
			System.out.println("Informe a idade: ");
			idade = in.nextInt();
			
			if(idade < 21) {
				totalmenos = totalmenos + 1;
			}
			else if(idade > 50) {
				totalmais = totalmais + 1;
			}
			
		}
			System.out.println("O total de pessoas com menos de 21 anos é de: " + totalmenos);
			System.out.println("O total de pessoas com mais de 50 anos é de: " + totalmais);
			
			in.close();

	}

}
