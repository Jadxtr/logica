// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão é:  F= (9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 

import java.util.Scanner; 

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
		 
		 input.close();
	}
}
