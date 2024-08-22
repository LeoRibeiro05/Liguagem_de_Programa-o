package exercicio10;

import java.util.Scanner;

public class avaliaçãoAluno {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita a primeira nota
	        System.out.print("Insira a primeira nota: ");
	        double primeiraNota = scanner.nextDouble();

	        // Solicita a segunda nota
	        System.out.print("Insira a segunda nota: ");
	        double segundaNota = scanner.nextDouble();

	        // Calcula a média aritmética
	        double mediaAritmetica = (primeiraNota + segundaNota) / 2;

	        // Verifica se o aluno foi aprovado ou reprovado
	        if (mediaAritmetica >= 6) {
	            System.out.printf("Aprovado! A média foi de: %.2f.%n", mediaAritmetica);
	        } else {
	            System.out.printf("Reprovado! A média foi de: %.2f.%n", mediaAritmetica);
	        }

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


