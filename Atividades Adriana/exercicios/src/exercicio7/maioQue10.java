package exercicio7;

import java.util.Scanner;

public class maioQue10 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Mensagem de introdução
	        System.out.println("Vamos verificar seu número!");

	        // Solicita ao usuário um número
	        System.out.print("Insira um número: ");
	        int numero = scanner.nextInt();

	        // Verifica se o número é maior que 10
	        if (numero > 10) {
	            System.out.println("É MAIOR QUE 10!");
	        } else {
	            // Para os casos onde o número é menor ou igual a 10
	            System.out.println("NÃO É MAIOR QUE 10!");
	        }

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


