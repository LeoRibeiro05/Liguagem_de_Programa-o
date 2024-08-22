package exercicio11;

import java.util.Scanner;

public class votar {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Mensagem de introdução
	        System.out.println("Verificação de idade mínima para voto.");

	        // Solicita o ano de nascimento
	        System.out.print("Insira o ano do seu nascimento: ");
	        int anoNasc = scanner.nextInt();

	        // Solicita o ano atual
	        System.out.print("Insira o ano atual: ");
	        int anoAtual = scanner.nextInt();

	        // Calcula a idade
	        int idade = anoAtual - anoNasc;

	        // Verifica se a pessoa está apta a votar
	        if (idade >= 16) {
	            System.out.println("Você está apto a votar! Procure a Justiça Eleitoral e tire seu título!");
	        } else {
	            System.out.println("Você ainda não está apto a votar.");
	        }

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


