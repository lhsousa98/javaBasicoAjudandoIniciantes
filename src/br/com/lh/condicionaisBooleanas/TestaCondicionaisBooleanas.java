package br.com.lh.condicionaisBooleanas;

public class TestaCondicionaisBooleanas {

	public static void main(String[] args) {
		// Boas práticas mais recomendável do que ficar criando um monte de ifs
		int idade = 16;
		int qtdePessoas = 4;
		// Ao invés de utilizar quantidadeDePessoas inteiro, utilizar booleanos
		// boolean já devolve true e false não pode ser numérico e nem caracteres, só
		// pode ser um ou outro.
		// boolean acompanhado = true;
		// outra solução atribuir qtde de pessoas e uma condicional dela

		boolean acompanhado = qtdePessoas >= 3;
		/* Obs: o acompanhado continua true, por causa que tem mais de 3 pessoas maior
		 de idade, acompanhadas ao menor de idade*/
		System.out.println("valor de acompanhado = " + acompanhado);
		
		boolean acompanhado1;

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar, " + "menor de idade.");
		}
		
		/**
		 * Escopo de inicialização, uma váriavel criada dentro de uma condição
		 * só existe dentro dessa condição, quando sair dela não existe mais ela morre
		 */
		
		if (qtdePessoas >= 4) {
			//só existe no if
			int x = 1;
			acompanhado1 = true;
		}
		else {
			//só existe no else
			int x = 2;
			acompanhado1 = false;
		}
		
		System.out.println("valor acompanhado = " + acompanhado1);
		
		//o x não compilará só funciona dentro da condição, onde foi declarada
		

	}

}
