package lista02_questões;

import java.util.Scanner;

public class Questão_05 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String turno;
		
		System.out.println("Informe o turno que você estuda: M - MATUTINO, V - VESPERTINO, N - NOTURNO");
		turno= entrada.next();
				
		switch(turno)
		{
		
			case "M":
				System.out.println("Bom dia!");
				break;
				
			case "V":
				System.out.println("Boa tarde!");
				break;
				
			case "N":
				System.out.println("Boa noite!");
				break;
				
				}
		
		entrada.close();
			
	}
	}