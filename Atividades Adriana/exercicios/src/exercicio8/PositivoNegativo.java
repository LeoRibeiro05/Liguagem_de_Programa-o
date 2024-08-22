package exercicio8;

import java.util.Scanner;

public class PositivoNegativo{
	
	public static void main(String[] args) {
	
	System.out.println("Bem vindo ao positivo x negativo.");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("digite um valor: ");
	
	int numero =scanner.nextInt();
	
	
	if (numero >= 0) {
			
		System.out.println("O número digitado é positivo");
	}
	else {
		
		System.out.println("O número digitado é negativo");
		
	}
	scanner.close();
	
	}
	
	

}
