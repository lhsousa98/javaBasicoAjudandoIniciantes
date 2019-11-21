package br.com.lh.repeticao;

public class TestaRepeticaoWHILE {

	public static void main(String[] args) {
		
		/*
		 * Estrutura de repetição while enquanto for verdadeiro ela repetirá.
		 * colocar contador senão ela dá loop infinito
		 */
		
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println(contador);
			//incrementador contará de 1 a 1, e tem como decrementar contador--;
			//contador = contador + 1; //também funciona
			// contador += 1; //tambpem incrementa
			contador++;
		}
		System.out.println(contador);
	}

}
