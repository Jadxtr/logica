/* Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir. 
 * Para idade inferior a 5, deverá mostrar a mensagem "nenhuma".
 * Categorias: infantil (5 a 7 anos), juvenil (8 a 10), adolescente (11 a 15), adulto (16 a 30) ou sênior (acima de 30 anos). */

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Digite a idade do nadador: ");
		int idade = input.nextInt();
		
		String categoria;
		
		if (idade < 5) {
			categoria = "nenhuma";
		} else if (idade >= 5 && idade <= 7) {
			categoria = "infantil";
		} else if (idade >= 8 && idade <= 10) {
			categoria = "juvenil";
		} else if (idade >= 11 && idade <= 15) {
			categoria = "adolescente";
		} else if (idade >= 16 && idade <= 30) {
			categoria = "adulto";
		} else {
			categoria = "sênior";
		}
		
		System.out.println("Categoria: " + categoria);

		input.close();
	}
}