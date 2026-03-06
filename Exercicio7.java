// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		 System.out.print("Digite o valor depositado (R$): ");
		 double valor = input.nextDouble();
		 
		 double taxa = 0.70 / 100;
		 double rendimento = valor * taxa;
		 double valorFinal = valor + rendimento;
		 
		 System.out.printf("Valor depositado: R$ %.2f\n", valor);
		 System.out.printf("Rendimento (0.70%% a.m.): R$ %.2f\n", rendimento);
		 System.out.printf("Valor após um mês: R$ %.2f\n", valorFinal);

		input.close();
	}
}