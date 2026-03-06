// Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = input.nextLine();
		
		System.out.print("Digite a nota da 1ª prova: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite a nota da 2ª prova: ");
		double nota2 = input.nextDouble();
		
		System.out.print("Digite a nota da 3ª prova: ");
		double nota3 = input.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\nAluno: " + nome);
		System.out.printf("Média: %.2f\n", media);
		
		input.close();
	}
}
