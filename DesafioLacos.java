package sintaxe_variaveis_fluxo;

public class DesafioLacos {
	//Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
	public static void main(String[] args) {
		
		for(int contador = 1; contador<=100; contador++) {//for (int i = 3; i < 100; i += 3 ){
			if(contador % 3 == 0) {
			System.out.print(contador);
			System.out.print(" ");}
		}
	}

}
