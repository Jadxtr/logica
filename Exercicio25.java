/* Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
 * Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de lados do polígono: ");
		int lados = input.nextInt();
		
		System.out.print("Digite a medida do lado (cm): ");
		double lado = input.nextDouble();
		
		if (lados < 3) {
			System.out.println("NÃO É UM POLÍGONO");
		} else if (lados == 3) {
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
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}
		
		input.close();
	}
}