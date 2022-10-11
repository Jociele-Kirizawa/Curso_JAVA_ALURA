package sintaxe_variaveis_fluxo;

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario; //variaveis decimais float
		salario = 2000.10;
		System.out.println(salario);
		
		
		double divisao = 3.14/2;
		System.out.println(divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		double novaDivisao = 5.0/2; //tem que colocar um ponto flutuante para executar a conta corretamente
		System.out.println(novaDivisao);
		
		double preco = 5.5;
		int ingressos = 4;
		System.out.println(preco * ingressos);
	}

}
