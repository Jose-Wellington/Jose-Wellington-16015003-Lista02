package lista02_quest�es;

import java.util.Scanner;

public class Quest�o_02 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double num1;
		double num2;
		double num3;
		
		System.out.println("Informe o valor de A: ");
		num1= entrada.nextDouble();
		
		System.out.println("Informe o valor de B: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Informe o valor de C: ");
		num3 = entrada.nextDouble();
		
		
		if (num1>num2 && num1>num3) {
			
			System.out.println("O maior numero ser� A: " + num1);
		} 
			if (num2>num1 && num2>num3) {
			
			System.out.println("O maior numero ser� B: " + num2);
		} 
				if (num3>num1 && num3>num2) {
				
				System.out.println("O maior numero ser� C: " + num3);
			}
				
				
				if (num1<num2 && num1<num3) {
					
					System.out.println("O menor numero ser� A: " + num1);
				} 
					if (num2<num1 && num2<num3) {
					
					System.out.println("O menor numero ser� B: " + num2);
				} 
						if (num3<num1 && num3<num2) {
						
						System.out.println("O menor numero ser� C: " + num3);
					}	
						
						
		entrada.close();
		
		
	}
	}