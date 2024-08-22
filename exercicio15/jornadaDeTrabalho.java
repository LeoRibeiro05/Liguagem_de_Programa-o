package exercicio15;

import java.util.Scanner;

public class jornadaDeTrabalho {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Constantes para jornada semanal e mensal
	        double jornadaSemanal = 40;
	        double jornadaMensal = jornadaSemanal * 4; // 4 semanas em um mês

	        // Mensagem de introdução
	        System.out.println("Cálculo de horas extras.");

	        // Solicita o valor da hora do funcionário
	        System.out.print("Insira o valor da hora do funcionário: R$");
	        double custoHora = scanner.nextDouble();

	        // Solicita o número de horas trabalhadas no mês
	        System.out.print("Quantas horas o funcionário trabalhou no mês? ");
	        double horasTrabalhadas = scanner.nextDouble();

	        // Calcula o valor da hora extra (50% a mais que o valor da hora normal)
	        double custoHoraExtra = custoHora * 1.5;

	        // Inicializa o salário e as horas extras
	        double salarioTotal;
	        double horasExtras = 0;

	        if (horasTrabalhadas > jornadaMensal) {
	            // Calcula as horas extras
	            horasExtras = horasTrabalhadas - jornadaMensal;
	            // Calcula o salário total com horas extras
	            salarioTotal = (jornadaMensal * custoHora) + (horasExtras * custoHoraExtra);
	        } else {
	            // Calcula o salário total sem horas extras
	            salarioTotal = horasTrabalhadas * custoHora;
	        }

	        // Exibe o resultado
	        System.out.printf("O funcionário receberá R$%.2f no total.%n", salarioTotal);
	        if (horasExtras > 0) {
	            System.out.printf("Sendo R$%.2f de salário normal e R$%.2f de horas extras.%n",
	                              jornadaMensal * custoHora, horasExtras * custoHoraExtra);
	        }

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


