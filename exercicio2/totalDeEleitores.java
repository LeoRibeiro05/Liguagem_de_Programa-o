package exercicio2;

import java.util.Scanner;

public class totalDeEleitores {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Leitura do número total de eleitores
	        System.out.print("Insira o número total de eleitores: ");
	        int eleitores = scanner.nextInt();

	        // Verifica se o número total de eleitores é maior que zero
	        if (eleitores <= 0) {
	            System.out.println("O número total de eleitores deve ser maior que zero.");
	            return;
	        }

	        // Leitura do número de votos em branco
	        System.out.print("Insira o número total de votos em branco: ");
	        int votoBranco = scanner.nextInt();

	        // Leitura do número de votos nulos
	        System.out.print("Insira o número total de votos nulos: ");
	        int votoNulo = scanner.nextInt();

	        // Leitura do número de votos válidos
	        System.out.print("Insira o número total de votos válidos: ");
	        int votoValido = scanner.nextInt();

	        // Verifica se a soma dos votos é igual ao número total de eleitores
	        int totalVotos = votoBranco + votoNulo + votoValido;
	        if (totalVotos != eleitores) {
	            System.out.println("A soma dos votos em branco, nulos e válidos deve ser igual ao número total de eleitores.");
	            return;
	        }

	        // Cálculo e exibição dos percentuais
	        double percentualVotoBranco = (double) votoBranco * 100 / eleitores;
	        System.out.printf("Percentual de votos em branco: %.2f%%%n", percentualVotoBranco);

	        double percentualVotoNulo = (double) votoNulo * 100 / eleitores;
	        System.out.printf("Percentual de votos nulos: %.2f%%%n", percentualVotoNulo);

	        double percentualVotoValido = (double) votoValido * 100 / eleitores;
	        System.out.printf("Percentual de votos válidos: %.2f%%%n", percentualVotoValido);

	        // Fechamento do scanner
	        scanner.close();
	    
	    }
}


