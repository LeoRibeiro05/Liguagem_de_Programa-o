package exercicio12;

import java.util.Scanner;

public class doisValores {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Mensagem de introdução
	        System.out.println("Descubra qual valor é maior.");

	        // Solicita o primeiro valor
	        System.out.print("Insira o primeiro valor: ");
	        double primeiroValor = scanner.nextDouble();

	        // Solicita o segundo valor
	        System.out.print("Insira o segundo valor: ");
	        double segundoValor = scanner.nextDouble();

	        // Verifica qual valor é maior e exibe a mensagem correspondente
	        if (primeiroValor > segundoValor) {
	            System.out.println("O valor " + primeiroValor + " é maior!");
	        } else {
	            System.out.println("O valor " + segundoValor + " é maior!");
	        }

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


