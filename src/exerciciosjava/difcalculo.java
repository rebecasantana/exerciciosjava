package exerciciosjava;

import java.util.Scanner;

public class difcalculo {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
	float n1,n2,n3,n4, calculo;
		
	System.out.println("Digite n1:  ");
	n1 = leia.nextFloat();
	System.out.println("Digite n2:  ");
	n2 = leia.nextFloat();
	System.out.println("Digite n3:  ");
	n3 = leia.nextFloat();
	System.out.println("Digite n4:  ");
	n4 = leia.nextFloat();
	
	calculo = (n1 * n2) - (n3 *n4);
	System.out.printf("diferença: %.0f",calculo);
		

	}

}