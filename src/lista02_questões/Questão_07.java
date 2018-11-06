package lista02_questões;

import java.util.Scanner;

public class Questão_07 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		int horas;
		double preçof;
		
		System.out.println("Informe o setor: Adm - ADMINISTRATIVO ou Prod - PRODUÇÃO ");
		nome= entrada.next();
		
		System.out.println("Informe quantas horas foram trabalhadas: ");
		horas = entrada.nextInt();
				
				switch(nome) {
				
				case("Adm"):
					
					preçof = horas*12;
					
							System.out.println("O funcionario trabalha No ADMINISTRATIVO e seu salário será: R$" + preçof);
							break;
							
				case("Prod"):
					
					preçof = horas*10;
					
							System.out.println("O funcionario trabalha na PRODUÇÃO e seu salário será: R$" + preçof);
							break;
					
				}
							
		entrada.close();
		
	}
	}