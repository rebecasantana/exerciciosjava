package exerciciosjava;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float nota1, nota2, nota3, nota4;
		float mediaFinal;
	
		System.out.println("Informe a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Informe a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Informe a nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Informe a nota 4: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média final: %.1f ", mediaFinal);

				
	   	}

}
		