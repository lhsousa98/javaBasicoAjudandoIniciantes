package br.com.lh.caracteres;

public class TestaCaracteres {

	public static void main(String[] args) {
		//o char não pode ser vazio o String pode
		char letra = 'a';
		System.out.println(letra);
		
		//tabela asc
		char valor = 66;
		System.out.println(valor);
		
		//quando quero fazer um casting com char para int
		//esse + 1 vai alocar 67 e vai ser C maiúsculo
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String frase = "alura cursos online de tecnologia, ";
		System.out.println(frase);
		
		//ele concatena o string quando tem um mais
		frase = frase + 2020;
		System.out.println(frase);
		
	}

}
