package lista02_quest�es;

import java.util.Scanner;

public class Quest�o_03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double num1;
		double num2;
		double num3;
		
		System.out.println("Informe o valor do produto A: ");
		num1= entrada.nextDouble();
		
		System.out.println("Informe do produto A: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Informe do produto A: ");
		num3 = entrada.nextDouble();
				
				if (num1<num2 && num1<num3) {
					
					System.out.println("O produto que se deve comprar ser� A: " + num1);
				} 
					if (num2<num1 && num2<num3) {
					
					System.out.println("O produto que se deve comprar ser� B: " + num2);
				} 
						if (num3<num1 && num3<num2) {
						
						System.out.println("O produto que se deve comprar ser� C: " + num3);
					}	
						
						
		entrada.close();
		
		
	}
	}