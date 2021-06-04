package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
	
Scanner ler = new Scanner(System.in);
		
		int idade, sexo, humor, i=0;
		int cond1=0, cond2=0, cond3=0, cond4=0, cond5=0, cond6=0;
		
		while (i < 150) {
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Informe seu sexo (1-Masculino, 2-Feminimo, 3-Outros): ");
			sexo = ler.nextInt();
			
			System.out.println("Informe seu humor (1-Calmo(a), 2-Nervoso(a), 3-Agressivo(a)): ");
			humor = ler.nextInt();
			
			if (humor == 1) {
				cond1++;
			}
			if (sexo == 2 && humor == 2) {
				cond2++;
			}
			if (sexo == 1 && humor == 3) {
				cond3++;
			}
			if (sexo == 3 && humor == 1) {
				cond4++;
			}
			if (idade >= 40 && humor == 2) {
				cond5++;
			}
			if (idade <= 18 && humor == 1) {
				cond6++;
			}
		
			i++;
		}
		
		System.out.println("O número de pessoas calmas é: " + cond1);
		System.out.println("O número de mulheres nervosas é: " + cond2);
		System.out.println("O número de homens agressivos é: " + cond3);
		System.out.println("O número de outros calmos é: " + cond4);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + cond5);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + cond6);
		
		ler.close();

	}

}
