package lista02_quest�es;

import java.util.Scanner;

public class Quest�o_09 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double num1;
		double num2;
		double num3;
		
		System.out.println("Informe o primeiro lado: ");
		num1= entrada.nextDouble();
		System.out.println("Informe o primeiro lado: ");
		num2= entrada.nextDouble();
		System.out.println("Informe o primeiro lado: ");
		num3= entrada.nextDouble();
				
		if ((num1+num2)>num3 || (num1+num3)>num2 || (num2+num3)>num1) {
			
			if (num1==num2 && num2==num3 && num3==num1) {
				System.out.println("O triangulo � EQUIL�TERO");
			}
			if (num1==num2 && num1!=num3 || num2==num3 && num2!=num1 || num3==num1 && num3!=num2) {
				System.out.println("O triangulo � IS�SCELES");
			}
			if (num1!=num2 && num2!=num3 && num3!=num1) {
				System.out.println("O triangulo � ESCALENO");
			}
					
				}
		else {
			System.out.println("N�o � um triangulo");
		}
				
		entrada.close();
		
		
	}
	}