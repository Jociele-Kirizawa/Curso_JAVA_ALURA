package sintaxe_variaveis_fluxo;

public class testaLaco3 {
	public static void main(String[] args) {
		
	
	for(int linha1 = 0; linha1 <10; linha1++) {
		for(int coluna1 =0; coluna1 < 10; coluna1++) {
			if(coluna1 > linha1) {
				break;
				
				}
			System.out.print("*");
			
			}
		System.out.println();
		}
			
			
	}	

}
