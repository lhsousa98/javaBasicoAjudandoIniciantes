package br.com.lh.estruturas_condicionais;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicional simples!");
		// uma pessoa de 20 anos pode entrar numa festa de maiores de 18 anos
		int idade = 20;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos pode entrar, e seja bem vindo!");
		}

		System.out.println("Testando condicional composta!");

		int idade1 = 16;

		if (idade1 >= 18) {
			System.out.println("Você tem mais de 18 anos pode entrar, e seja bem vindo!");
		} else {
			System.out.println("Você tem menos de 18 anos, infelizmente não pode entrar!");
		}

		System.out.println("Testando condicional encandeada!");
		int quantidadeDePessoas = 2;

		// Caso a pessoa seja dimenor mas esteja acompanhada por uma pessoa maior de
		// idade, pode entrar.
		if (idade1 >= 18) {
			System.out.println("Você tem mais de 18 anos pode entrar," + " e seja bem vindo!");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, " + "pois está acompanhado.");
			} else {
				System.out.println("Você tem menos de 18 anos," + " infelizmente não pode entrar!");
			}

		}

	}
}
