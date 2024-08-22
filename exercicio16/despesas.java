package exercicio16;

import java.text.DecimalFormat;

import java.util.Scanner;

public class despesas {

	    public static void main(String[] args) {

	        // Criação do scanner para entrada de dados
	        Scanner scanner = new Scanner(System.in);
	        
	        // Criação do formatador DecimalFormat para exibição dos valores com 2 casas decimais
	        DecimalFormat formatador = new DecimalFormat("#.00");

	        // Solicita e lê os valores das despesas dos três meses
	        System.out.print("Insira o custo de Janeiro: R$ ");
	        double despjan = scanner.nextDouble();
	        
	        System.out.print("Insira o custo de Fevereiro: R$ ");
	        double despfev = scanner.nextDouble();
	        
	        System.out.print("Insira o custo de Março: R$ ");
	        double despmar = scanner.nextDouble();

	        // Cálculo do total e da média dos custos trimestrais
	        double totaltri = despjan + despfev + despmar;
	        double mediatri = totaltri / 3;

	        // Exibição dos resultados formatados
	        System.out.println("Os custos de Janeiro foram: R$ " + formatador.format(despjan));
	        System.out.println("Os custos de Fevereiro foram: R$ " + formatador.format(despfev));
	        System.out.println("Os custos de Março foram: R$ " + formatador.format(despmar));
	        System.out.println("O custo total do trimestre foi de: R$ " + formatador.format(totaltri));
	        System.out.println("O custo médio do trimestre foi de: R$ " + formatador.format(mediatri));

	        // Fechamento do scanner
	        scanner.close();
	    }
	}


