package exercicio14;

import java.util.Scanner;

public class jogoXadrez {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Mensagem de introdução
	        System.out.println("Calcule a duração do jogo de Xadrez.");

	        // Solicita a hora de início
	        System.out.print("Insira a hora de início: ");
	        int horaInicio = scanner.nextInt();

	        // Solicita a hora de término
	        System.out.print("Insira a hora de término: ");
	        int horaTermino = scanner.nextInt();

	        // Calcula a duração do jogo
	        int duracao;
	        if (horaTermino >= horaInicio) {
	            // Caso em que o término é no mesmo dia ou no mesmo período
	            duracao = horaTermino - horaInicio;
	        } else {
	            // Caso em que o término é no dia seguinte
	            duracao = (24 - horaInicio) + horaTermino;
	        }

	        // Exibe a duração do jogo
	        System.out.println("O jogo durou: " + duracao + " horas.");

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


