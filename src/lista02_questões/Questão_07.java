package lista02_quest�es;

import java.util.Scanner;

public class Quest�o_07 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		int horas;
		double pre�of;
		
		System.out.println("Informe o setor: Adm - ADMINISTRATIVO ou Prod - PRODU��O ");
		nome= entrada.next();
		
		System.out.println("Informe quantas horas foram trabalhadas: ");
		horas = entrada.nextInt();
				
				switch(nome) {
				
				case("Adm"):
					
					pre�of = horas*12;
					
							System.out.println("O funcionario trabalha No ADMINISTRATIVO e seu sal�rio ser�: R$" + pre�of);
							break;
							
				case("Prod"):
					
					pre�of = horas*10;
					
							System.out.println("O funcionario trabalha na PRODU��O e seu sal�rio ser�: R$" + pre�of);
							break;
					
				}
							
		entrada.close();
		
	}
	}