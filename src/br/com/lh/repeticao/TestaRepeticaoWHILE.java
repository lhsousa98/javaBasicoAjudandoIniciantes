package br.com.lh.repeticao;

public class TestaRepeticaoWHILE {

	public static void main(String[] args) {
		
		/*
		 * Estrutura de repeti��o while enquanto for verdadeiro ela repetir�.
		 * colocar contador sen�o ela d� loop infinito
		 */
		
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println(contador);
			//incrementador contar� de 1 a 1, e tem como decrementar contador--;
			//contador = contador + 1; //tamb�m funciona
			// contador += 1; //tambpem incrementa
			contador++;
		}
		System.out.println(contador);
	}

}
