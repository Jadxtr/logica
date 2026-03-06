/*
 Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
 * Calcular e imprimir o seguinte:
 * Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área.
 * Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
 * Se o número de lados for igual a 5 escrever PENTÁGONO. 
*/

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de lados do polígono: ");
		int lados = input.nextInt();
		
		System.out.print("Digite a medida do lado (cm): ");
		double lado = input.nextDouble();
		
		if (lados == 3) {
			double area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
			System.out.println("TRIÂNGULO");
			System.out.printf("Área: %.2f cm²\n", area);
		} else if (lados == 4) {
			double area = Math.pow(lado, 2);
			System.out.println("QUADRADO");
			System.out.printf("Área: %.2f cm²\n", area);
		} else if (lados == 5) {
			double area = (Math.pow(lado, 2) * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
			System.out.println("PENTÁGONO");
			System.out.printf("Área: %.2f cm²\n", area);
		} else {
			System.out.println("Número de lados não suportado!");
		}
		
		input.close();
	}
}