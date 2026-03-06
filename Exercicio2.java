//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

import  java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double ConsumoMedio;
		double kmi; // distância inicial
		double kmf; //distância final
		double litros;
		double kmtotal;

		System.out.print("Digite a distância inicial (km): ");
		kmi = input.nextDouble();
		
		System.out.print("Digite a distância final (km): ");
		kmf = input.nextDouble();
		
		System.out.print("Digite o combustível gasto (litros): ");
		litros = input.nextDouble();
		
		kmtotal = kmf - kmi;
		ConsumoMedio = kmtotal / litros;
		
		System.out.printf("Distância total percorrida: %.2f km\n", kmtotal);
		System.out.printf("Consumo médio: %.2f km/l\n", ConsumoMedio);

		input.close();
	}
}
