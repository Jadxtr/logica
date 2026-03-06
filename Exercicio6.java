// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a cotação do dólar (R$/US$): ");
		double cotacao = input.nextDouble();
		
		System.out.print("Digite a quantidade de dólares (US$): ");
		double dolar = input.nextDouble();
		
		double real = dolar * cotacao;
		
		System.out.printf("US$ %.2f = R$ %.2f\n", dolar, real);

		 input.close();
	}
}
