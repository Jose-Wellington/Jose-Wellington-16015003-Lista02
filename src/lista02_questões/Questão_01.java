package lista02_quest�es;

import java.util.Scanner;

public class Quest�o_01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Informe o valor de A: ");
		num1= entrada.nextInt();
		
		System.out.println("Informe o valor de B: ");
		num2 = entrada.nextInt();
		
		if (num1%num2==0) {
			
			System.out.println("A � divisivel por B");
		} else {
			System.out.println("A n�o � divisivel por B");
		}
		
		entrada.close();
		
		
	}
	}