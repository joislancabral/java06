package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = tc.nextInt();
		
		int[] num = new int[n];

		int negativos = 0;
		for(int i = 0; i < num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = tc.nextInt();
			
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
				negativos = num[i];
				System.out.println(negativos);
			}
		}
		
		
	}

}
