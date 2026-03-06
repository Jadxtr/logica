/* Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. 
 * Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. 
 * O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos. */

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Digite o salário de Carlos: ");
		double salarioCarlos = input.nextDouble();
		
		double salarioJoao = salarioCarlos / 3;
		
		double valorCarlos = salarioCarlos;
		double valorJoao = salarioJoao;
		
		int meses = 0;
		
		while (valorJoao < valorCarlos) {
			valorCarlos = valorCarlos * 1.02;
			valorJoao = valorJoao * 1.05;
			meses++;
		}
		
		System.out.printf("\nSalário de Carlos: R$ %.2f\n", salarioCarlos);
		System.out.printf("Salário de João: R$ %.2f\n", salarioJoao);
		System.out.printf("Valor de Carlos após %d meses: R$ %.2f\n", meses, valorCarlos);
		System.out.printf("Valor de João após %d meses: R$ %.2f\n", meses, valorJoao);
		System.out.printf("Quantidade de meses necessários: %d\n", meses);
		
		input.close();
	}
}