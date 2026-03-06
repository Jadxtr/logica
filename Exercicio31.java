// Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

import java.util.Scanner;

public class Exercicio31 {    
	public static int fibonacci(int numero) {
        if (numero == 0) return 0;
        if (numero == 1) return 1;
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Informe a posição do termo na sequência Fibonacci: ");
		int num = input.nextInt();
		
		if (num < 0) {
			System.out.println("Posição inválida! Digite um número positivo.");
		} else {
			System.out.println("O " + num + "º termo da sequência Fibonacci é: " + fibonacci(num));
		}
		
		input.close();
	}
}