package lista02_questões;

import java.util.Scanner;

public class Questão_10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double num1;
		double num2;
		double num3 = 0;
		double num4 = 0;
		double num5;
		double num6;
		double num7;
		double num8;
		
		System.out.println("Informe quantos Kg de morango: ");
		num1= entrada.nextDouble();
		System.out.println("Informe quantos Kg de maçã: ");
		num2= entrada.nextDouble();

				
		if (num1<=5) {
		num3 = 2.5*num1;
		}
			else {
				num3 = 2.20*num1;
			}
		
		
		if (num2<=5) {
			num4 =1.8*num2;	
		}
			else {
				num4 =1.5*num2;
			}
		
		
		num5 = num1+num2;
		
		num6 = num3+num4;
			
		num7 = num6 * 10/100;
		
	if (num5>8 || num6>25) {
		num8 = num6 - num7;
			System.out.println("O valor final da sua compra será: R$" + num8);
			}
		
	else {	
		System.out.println("O valor final da sua compra será: R$" + num6);
		}
				
		entrada.close();
		
	}
	}