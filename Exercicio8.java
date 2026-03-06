/* As maçãs custam R$ 0,30 cada se forem compradas menos de uma dúzia e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. */


import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Digite o número de maçãs compradas: ");
		int quantidade = input.nextInt();
		
		double preco;
		if (quantidade < 12) {
			preco = 0.30;
		} else {
			preco = 0.25;
		}
		
		double total = quantidade * preco;
		
		System.out.printf("Quantidade: %d maçãs\n", quantidade);
		System.out.printf("Preço unitário: R$ %.2f\n", preco);
		System.out.printf("Custo total: R$ %.2f\n", total);

		input.close();
	}
}