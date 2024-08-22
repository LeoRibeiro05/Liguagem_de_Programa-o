package exercicio5;

import java.util.Scanner;

public class salarioVendedor {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita o valor do salário fixo
	        System.out.print("Insira o valor do salário fixo: R$ ");
	        double salarioFixo = scanner.nextDouble();

	        // Solicita a quantidade de carros vendidos
	        System.out.print("Insira a quantidade de carros vendidos: ");
	        int qntdVendida = scanner.nextInt();

	        // Solicita o valor total das vendas
	        System.out.print("Insira o valor total das vendas do funcionário: R$ ");
	        double totalVendas = scanner.nextDouble();

	        // Solicita o valor unitário da comissão por carro vendido
	        System.out.print("Insira o valor unitário da comissão por carro vendido: R$ ");
	        double comissao = scanner.nextDouble();

	        // Cálculo da comissão total
	        double totalComissao = qntdVendida * comissao;

	        // Cálculo da porcentagem das vendas
	        double porcentagemVenda = totalVendas * 0.05;

	        // Cálculo do salário final
	        double salarioFinal = salarioFixo + totalComissao + porcentagemVenda;

	        // Exibição do salário final formatado
	        System.out.printf("O salário final do funcionário será de: R$ %.2f%n", salarioFinal);

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


