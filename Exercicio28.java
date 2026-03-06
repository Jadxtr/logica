/* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
* Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
* Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
* Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro ângulo: ");
		double angulo1 = input.nextDouble();
		
		System.out.print("Digite o segundo ângulo: ");
		double angulo2 = input.nextDouble();
		
		System.out.print("Digite o terceiro ângulo: ");
		double angulo3 = input.nextDouble();
		
		double soma = angulo1 + angulo2 + angulo3;
		
		if (soma != 180) {
			System.out.println("Não é um triângulo válido! A soma dos ângulos deve ser 180°");
		} else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Triângulo Retângulo");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Triângulo Obtusângulo");
		} else {
			System.out.println("Triângulo Acutângulo");
		}
		
		input.close();
	}
}