package lista02_quest�es;

import java.util.Scanner;

public class Quest�o_08 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double num1;
		double num2;
		double num3;
		double num4;
		
		System.out.println("Informe o sal�rio: ");
		num1= entrada.nextDouble();
				
				if (num1<280) {
					
					num2 = 20;
					num3 = num1 *(num2/100);
					num4 = num1 + num3;
					
					System.out.println("O sal�rio antes do reajuste era de: R$" + num1);
					System.out.println("O percentual de aumento aplicado foi de: " + num2 + "%");
					System.out.println("O valor do aumento foi: R$" + num3);
					System.out.println("O novo salario, ap�s o aumento �: R$" + num4);
					
				} 
				if (num1>=280 && num1<700) {
					
					num2 = 15;
					num3 = num1 *(num2/100);
					num4 = num1 + num3;
					
					System.out.println("O sal�rio antes do reajuste era de: R$" + num1);
					System.out.println("O percentual de aumento aplicado foi de: " + num2 + "%");
					System.out.println("O valor do aumento foi: R$" + num3);
					System.out.println("O novo salario, ap�s o aumento �: R$" + num4);
					
				}
				if (num1>=700 && num1<1500) {
		
					num2 = 10;
					num3 = num1 *(num2/100);
					num4 = num1 + num3;
		
					System.out.println("O sal�rio antes do reajuste era de: R$" + num1);
					System.out.println("O percentual de aumento aplicado foi de: " + num2 + "%");
					System.out.println("O valor do aumento foi: R$" + num3);
					System.out.println("O novo salario, ap�s o aumento �: R$" + num4);
		
				}
				if (num1>=1500) {
		
					num2 = 5;
					num3 = num1 *(num2/100);
					num4 = num1 + num3;
		
					System.out.println("O sal�rio antes do reajuste era de: R$" + num1);
					System.out.println("O percentual de aumento aplicado foi de: " + num2 + "%");
					System.out.println("O valor do aumento foi: R$" + num3);
					System.out.println("O novo salario, ap�s o aumento �: R$" + num4);
		
				}

						
						
		entrada.close();
		
		
	}
	}