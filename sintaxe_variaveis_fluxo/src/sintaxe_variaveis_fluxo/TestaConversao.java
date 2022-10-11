package sintaxe_variaveis_fluxo;

public class TestaConversao {
	public static void main(String[] arrgs) {
		double salario = 1227.50;
		int valor = (int) salario; //não permite um double dentro do int. Devemos forçar o doublke dentro do int
		// int pra double é ok.
		System.out.println(valor);
		
		int numero = 2000000000; //ate 2 bilhoes. acima disso, long
		long numeroGrande = 8745855656876778978L; //colocar L no final
		short valorPequeno = 2131; //16bites
		byte b = 127;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		System.out.println(valor1 + valor2); 
		
	}

}
