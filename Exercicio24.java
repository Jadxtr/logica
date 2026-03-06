/* Escreva um programa para ler a altura, peso e gênero para calcular o IMC.
*/

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int genero;
		double altura, peso, pesoIdeal = 0, imc;
		
		System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
		genero = input.nextInt();
		
		System.out.print("Digite a altura (m): ");
		altura = input.nextDouble();
		
		System.out.print("Digite o peso (kg): ");
		peso = input.nextDouble();
		
		// Cálculo do peso ideal
		if (genero == 1) {
			pesoIdeal = (altura * 100 - 105);
		} else if (genero == 2) {
			pesoIdeal = (altura * 100 - 100);
		}
		
		// Cálculo do IMC
		imc = peso / (altura * altura);
		
		// Classificação do IMC
		String classificacao;
		if (imc < 18.5) {
			classificacao = "Abaixo do peso";
		} else if (imc < 25) {
			classificacao = "Peso normal";
		} else if (imc < 30) {
			classificacao = "Acima do peso/Sobrepeso";
		} else if (imc < 35) {
			classificacao = "Obesidade grau 1";
		} else if (imc < 40) {
			classificacao = "Obesidade grau 2";
		} else {
			classificacao = "Obesidade grau 3";
		}
		
		System.out.println("\n========== RESULTADO IMC ==========");
		System.out.printf("Altura: %.2f m\n", altura);
		System.out.printf("Peso: %.2f kg\n", peso);
		System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
		System.out.printf("IMC: %.2f\n", imc);
		System.out.println("Classificação: " + classificacao);
		System.out.println("===================================");
		
		input.close();
	}
}