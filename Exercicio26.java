// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.


import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int num2 = input.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		int num3 = input.nextInt();
		
		int maior;
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
		} else {
			maior = num3;
		}
		
		System.out.println("O maior valor é: " + maior);
		
		input.close();

	}
}