package sintaxe_variaveis_fluxo;

public class exercicio {
	public static void main(String[] args) {

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (linha< coluna) {
					break;
				}
				System.out.print(coluna + 1);
			}
			System.out.println();
		}
	}

}
