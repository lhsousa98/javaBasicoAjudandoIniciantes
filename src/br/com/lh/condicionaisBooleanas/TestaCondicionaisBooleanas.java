package br.com.lh.condicionaisBooleanas;

public class TestaCondicionaisBooleanas {

	public static void main(String[] args) {
		// Boas pr�ticas mais recomend�vel do que ficar criando um monte de ifs
		int idade = 16;
		int qtdePessoas = 4;
		// Ao inv�s de utilizar quantidadeDePessoas inteiro, utilizar booleanos
		// boolean j� devolve true e false n�o pode ser num�rico e nem caracteres, s�
		// pode ser um ou outro.
		// boolean acompanhado = true;
		// outra solu��o atribuir qtde de pessoas e uma condicional dela

		boolean acompanhado = qtdePessoas >= 3;
		/* Obs: o acompanhado continua true, por causa que tem mais de 3 pessoas maior
		 de idade, acompanhadas ao menor de idade*/
		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar, " + "menor de idade.");
		}

	}

}
