package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.CoverteMoeda;

public class Programa {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o Valor do Dolar");
		double vlrDolar = sc.nextDouble();
		System.out.print("Quantidade de Dolares que gostaria de comprar ?");
		double qtdDolar = sc.nextDouble();
		double resultado = CoverteMoeda.Coverte(vlrDolar, qtdDolar);
		System.out.printf(" o Valor a ser pago é = %2fn ",resultado);
		
		
	 sc.close();
	}

}
