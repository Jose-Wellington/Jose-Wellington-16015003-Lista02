package lista02_questões;

import java.util.Scanner;

public class Questão_06 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		double preço;
		String cond;
		double preçof;
		
		System.out.println("Informe o nome do produto: ");
		nome= entrada.next();
		
		System.out.println("Informe preço do produto: ");
		preço = entrada.nextDouble();
		
		System.out.println("Informe condição de pagamento: A - À vista ou B - A prazo");
		cond = entrada.next();
				
				switch(cond) {
				
				case("A"):
					
					preçof = (preço) - (preço*5/100);
					
							System.out.println("O preço final do produto " + nome + " será: R$" + preçof);
							break;
							
				case("B"):
					
					preçof = (preço) + (preço*2/100);
					
							System.out.println("O preço final do produto " + nome + " será: R$" + preçof);
							break;
					
				}
							
		entrada.close();
		
	}
	}