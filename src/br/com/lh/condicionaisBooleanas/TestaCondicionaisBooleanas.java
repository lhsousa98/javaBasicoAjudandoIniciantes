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

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar, " + "menor de idade.");
		}

	}

}
