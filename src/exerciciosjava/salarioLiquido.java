package exerciciosjava;

import java.util.Scanner;

public class salarioLiquido {

	public static void main(String[] args) {

	float salario,adicional,horas,desconto,salariol;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o seu Salário:  ");
	salario = leia.nextFloat();
	System.out.println("Digite o  Adicional Noturno:  ");
	adicional = leia.nextFloat();
	System.out.println("Digite as Horas Extras:  ");
	horas = leia.nextFloat();
	System.out.println("Digite os Descontos:  ");
	desconto = leia.nextFloat();
	
	
	salariol = salario+adicional+(horas *5)-desconto;
	System.out.println("Seu salario Líquido é: " +salariol);
		

	}

}