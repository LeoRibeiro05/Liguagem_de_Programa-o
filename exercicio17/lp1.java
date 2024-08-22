package exercicio17;

import java.util.Scanner;

import static java.lang.Math.max;

public class lp1 {
	
	
    public static void main(String[] args) {

	        // Criação do scanner para entrada de dados
	        Scanner scanner = new Scanner(System.in);

	        // Solicita as notas ao usuário
	        System.out.print("Escreva a nota P1: ");
	        double p1 = scanner.nextDouble();

	        System.out.print("Escreva a nota E1: ");
	        double e1 = scanner.nextDouble();

	        System.out.print("Escreva a nota E2: ");
	        double e2 = scanner.nextDouble();

	        System.out.print("Escreva a nota da API: ");
	        double api = scanner.nextDouble();

	        System.out.print("Escreva a nota X: ");
	        double x = scanner.nextDouble();

	        System.out.print("Escreva a nota SUB (se não houve SUB, digite 0): ");
	        double sub = scanner.nextDouble();

	        // Calcula a média ponderada das notas
	        double mediaNotas = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4);
	        double lp1 = mediaNotas * 0.5 + 
	                     (max((mediaNotas - 5.9), 0) / (mediaNotas - 5.9)) * (api * 0.5) + 
	                     x + 
	                     (sub * 0.2);

	        // Exibe a média do semestre
	        System.out.println("A média do semestre é: " + lp1);

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


