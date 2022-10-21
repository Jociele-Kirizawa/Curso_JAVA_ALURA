package sintaxe_variaveis_fluxo;

public class testalacoDesafioFatorial {
	public static void main(String[] args) {
		// Nesse exercício opcional, o seu desafio é imprimir os fatoriais de 1 a 10
//O fatorial de 0 é 1.
//O fatorial de 1 é (0!) * 1 = 1.
//O fatorial de 2 é (1!) * 2 = 2
//O fatorial de 3 é (2!) * 3 = 6
//O fatorial de 4 é (3!) * 4 = 24
		
		        int fatorial = 1;
		        for (int i = 1; i < 11; i++) {
		            fatorial *= i; // fatorial = fatorial*i
		            System.out.println("Fatorial de " + i + " = " + fatorial);
		        }
		    }
		}
			
