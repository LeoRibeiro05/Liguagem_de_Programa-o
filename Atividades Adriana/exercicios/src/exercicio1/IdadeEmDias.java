package exercicio1;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {

		System.out.println("Bem vindo a sua idade em dias.");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a sua idade:");
		
		int idade =scanner.nextInt();
		
		System.out.println("digite os meses referente a sua idade atual e a proxima (exemplo : tenho 25 anos e 2 meses.) :");
		
		int mes =scanner.nextInt();
		
		System.out.println("digite os dias referente a sua idade atual e a proxima (exemplo : tenho 25 anos, 2 meses e 4 dias de vida.)");
		
		int dias =scanner.nextInt();
		
		int anoConvertido = idade * 365;
		int mesConvertido = mes * 30;
		int idadeEmDias = anoConvertido + mesConvertido + dias;
		 
		System.out.println("Sua idade em dias é :" + idadeEmDias + " dias");
		scanner.close();
		
		
}
}