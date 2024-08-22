package exercicio9;

import java.util.Scanner;

public class maças {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Mensagem de boas-vindas
	        System.out.println("Bem-vindo à loja de maçãs!");
	        
	        // Solicita o número de maçãs desejadas
	        System.out.print("Insira quantas maçãs você gostaria de comprar: ");
	        int quantidadeMacas = scanner.nextInt();
	        
	        // Definição dos preços unitários
	        double precoUnitario;
	        if (quantidadeMacas >= 12) {
	            precoUnitario = 1.00;
	        } else {
	            precoUnitario = 1.30;
	        }
	        
	        // Cálculo do custo total
	        double custoTotal = quantidadeMacas * precoUnitario;
	        
	        // Exibição do custo total formatado com duas casas decimais
	        System.out.printf("Você pagará R$ %.2f por %d maçãs.%n", custoTotal, quantidadeMacas);
	        
	        // Fechamento do scanner
	        scanner.close();
	    }
	}


