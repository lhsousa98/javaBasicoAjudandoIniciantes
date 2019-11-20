package br.com.lh.castings;

public class TestaConversao {

	public static void main(String[] args) {
		// Casting é transformar um tipo para o outro uma transformação
		double salario = 1250.70;
		int valor = (int) salario;

		System.out.println(valor);
		System.out.println("meu salário é " + salario);
		
		//int pode guardar até 2 bilhões, 32 bits
		//long é maior verdadeiramente grande 64 bits
		
		long numeroGrande = 32432423523L;
		
		short valorPequeno = 2131;
		
		//-128 à 127
		byte b = 127;
		
		//procurar
		double valor1 = 0.2;
		double valor2 = 0.1;
		double resultado = valor1 + valor2;
		System.out.println(resultado);

	}

}
