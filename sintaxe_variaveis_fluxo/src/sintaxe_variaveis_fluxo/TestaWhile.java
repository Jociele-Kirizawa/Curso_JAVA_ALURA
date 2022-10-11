package sintaxe_variaveis_fluxo;

public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			total = total + contador; //posso escrever total += contador
			System.out.println(total);
			contador++;
			
			
		}
		System.out.println(total);
	}

}
