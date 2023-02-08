package exerciciosjava;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario,abono, novoSalario;
		
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("novo salario: R$ %.2f", novoSalario);

	}

}