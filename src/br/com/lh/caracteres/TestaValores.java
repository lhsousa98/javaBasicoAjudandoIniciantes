package br.com.lh.caracteres;

public class TestaValores {
	public static void main(String[] args) {

		int primeiro = 5;
		int segundo = 7;

		// o segundo n�mero vai equivaler ao primeiro
		segundo = primeiro;

		System.out.println(segundo);

		// guardando o 10 no primeiro, atribuindo copiando e colando quando fa�o isso
		primeiro = 10;
		System.out.println(primeiro);
	}
}
