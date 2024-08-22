package exercicio3;

import java.util.Scanner;

public class salarioMensal {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Cálculo de novo salário:");
	        
	        // Leitura do salário atual
	        System.out.print("Insira o salário atual do funcionário: R$ ");
	        double salarioAtual = scanner.nextDouble();

	        // Leitura do percentual de reajuste
	        System.out.print("Insira o percentual de reajuste: ");
	        double percentualDeAumento = scanner.nextDouble();

	        // Cálculo do novo salário
	        double novoSalario = salarioAtual + (salarioAtual * (percentualDeAumento / 100));

	        // Exibição do novo salário formatado
	        System.out.printf("O salário reajustado é de: R$ %.2f%n", novoSalario);

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


