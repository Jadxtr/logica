// Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente (1 = janeiro, 2 = fevereiro),

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Digite um número entre 1 e 12: ");
		int numero = input.nextInt();
		
		String mes;
		
		switch(numero) {
			case 1:
				mes = "janeiro";
				break;
			case 2:
				mes = "fevereiro";
				break;
			case 3:
				mes = "março";
				break;
			case 4:
				mes = "abril";
				break;
			case 5:
				mes = "maio";
				break;
			case 6:
				mes = "junho";
				break;
			case 7:
				mes = "julho";
				break;
			case 8:
				mes = "agosto";
				break;
			case 9:
				mes = "setembro";
				break;
			case 10:
				mes = "outubro";
				break;
			case 11:
				mes = "novembro";
				break;
			case 12:
				mes = "dezembro";
				break;
			default:
				mes = "número inválido";
		}
		
		System.out.println("Mês: " + mes);
		
		input.close();
	}
}