// Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Digite um número entre 1 e 7: ");
		int numero = input.nextInt();
		
		String dia;
		
		switch(numero) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda-feira";
				break;
			case 3:
				dia = "terça-feira";
				break;
			case 4:
				dia = "quarta-feira";
				break;
			case 5:
				dia = "quinta-feira";
				break;
			case 6:
				dia = "sexta-feira";
				break;
			case 7:
				dia = "sábado";
				break;
			default:
				dia = "número inválido";
		}
		
		System.out.println("Dia da semana: " + dia);
			
		input.close();
	}
}