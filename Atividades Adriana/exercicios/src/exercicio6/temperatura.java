package exercicio6;

import java.util.Scanner;

public class temperatura {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Mensagem de introdução
	        System.out.println("Conversão de temperaturas");

	        // Solicita a temperatura em Fahrenheit
	        System.out.print("Insira a temperatura em Fahrenheit: ");
	        double tempF = scanner.nextDouble();

	        // Conversão de Fahrenheit para Celsius
	        double tempC = (tempF - 32) / 1.8;

	        // Exibição da temperatura convertida formatada com duas casas decimais
	        System.out.printf("A temperatura %.2f° Fahrenheit equivale a %.2f° Celsius%n", tempF, tempC);

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


