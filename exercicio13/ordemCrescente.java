package exercicio13;

import java.util.Scanner;

public class ordemCrescente {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Mensagem de introdução
	        System.out.println("Escrevendo valores em ordem crescente:");

	        // Solicita o primeiro valor
	        System.out.print("Escreva o primeiro valor: ");
	        double primeiroValor = scanner.nextDouble();

	        // Solicita o segundo valor
	        System.out.print("Escreva o segundo valor: ");
	        double segundoValor = scanner.nextDouble();

	        // Verifica e exibe os valores em ordem crescente
	        if (primeiroValor < segundoValor) {
	            System.out.printf("A ordem crescente é: %.2f, %.2f.%n", primeiroValor, segundoValor);
	        } else {
	            System.out.printf("A ordem crescente é: %.2f, %.2f.%n", segundoValor, primeiroValor);
	        }

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


