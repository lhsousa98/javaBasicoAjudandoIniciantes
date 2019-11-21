package br.com.lh.repeticao;

public class TestaLacos2 {

	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
				for (int coluna = 1; coluna <= linha; coluna++){
				if (coluna > linha) {
					// Ele sai do laço mais próximo no caso ele sai do if e for
					break;
				}
				System.out.print("*");
			}
			// quebra de linhas
			System.out.println();
		}

	}
}
