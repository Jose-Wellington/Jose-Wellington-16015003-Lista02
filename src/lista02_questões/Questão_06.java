package lista02_quest�es;

import java.util.Scanner;

public class Quest�o_06 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		double pre�o;
		String cond;
		double pre�of;
		
		System.out.println("Informe o nome do produto: ");
		nome= entrada.next();
		
		System.out.println("Informe pre�o do produto: ");
		pre�o = entrada.nextDouble();
		
		System.out.println("Informe condi��o de pagamento: A - � vista ou B - A prazo");
		cond = entrada.next();
				
				switch(cond) {
				
				case("A"):
					
					pre�of = (pre�o) - (pre�o*5/100);
					
							System.out.println("O pre�o final do produto " + nome + " ser�: R$" + pre�of);
							break;
							
				case("B"):
					
					pre�of = (pre�o) + (pre�o*2/100);
					
							System.out.println("O pre�o final do produto " + nome + " ser�: R$" + pre�of);
							break;
					
				}
							
		entrada.close();
		
	}
	}