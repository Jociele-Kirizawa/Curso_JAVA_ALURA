package sintaxe_variaveis_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Você é maior idade");
		} else {//todo esse bloco esta dentro desse else
			if (quantidadePessoas >= 2) {
				System.out.println("Voce pode participar acompanhado");
			} else {
				System.out.println("Infelizmente voce não pode participar");
			}
		}

	}

}
