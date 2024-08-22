package exercicio4;

import java.util.Scanner;

public class custoCarro {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Percentuais fixos para o cálculo
	        final double PERCENTUAL_DISTRIBUIDOR = 0.28;
	        final double PERCENTUAL_IMPOSTO = 0.45;

	        // Solicita ao usuário o preço de fábrica
	        System.out.println("Cálculo do preço final do veículo.");
	        System.out.print("Insira o preço de custo do veículo em R$: ");
	        double precoFabrica = scanner.nextDouble();

	        // Cálculo do imposto e do valor do distribuidor
	        double imposto = precoFabrica * PERCENTUAL_IMPOSTO;
	        double distribuidor = precoFabrica * PERCENTUAL_DISTRIBUIDOR;
	        
	        // Cálculo do preço final
	        double precoFinal = precoFabrica + imposto + distribuidor;

	        // Exibição dos resultados formatados
	        System.out.printf("Preço final do veículo: R$ %.2f%n", precoFinal);
	        System.out.printf("Imposto: R$ %.2f%n", imposto);
	        System.out.printf("Distribuição: R$ %.2f%n", distribuidor);

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


