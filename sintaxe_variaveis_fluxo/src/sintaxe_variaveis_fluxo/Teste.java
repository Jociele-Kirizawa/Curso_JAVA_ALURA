package sintaxe_variaveis_fluxo;

	public class Teste {
	    public static void main(String[] args) {

	        double salario = 3300.0;
	        System.out.println(salario);

	        if(salario < 2600.0) { 
	            System.out.println("A sua aliquota é de 15%");
	            System.out.println("Você pode deduzir até R$ 350");}

	        if(salario < 3750.0) { 
	            System.out.println("A sua aliquota é de 22,5%");
	            System.out.println("Você pode deduzir até R$ 636");}
	        
	

	                double salario12 = 9300.0;
	                
	                if (salario12>= 1900.0 && salario12 <= 2800.0){
	                	System.out.println(salario12 + "O IR é de 7.5% e pode deduzir até 142 reais");
	                }else {
	                	if(salario12 >= 2800.01 && salario12 <= 3751.0) {
	                		System.out.println(salario12 + "O IR é de 15% e pode deduzir 350");}
	                	if(salario12 >= 3751.01 && salario<=4664.0) {
	                		System.out.println(salario12 + "O IR é de 22.5% e pode deduzir 636");
	                	}
	                	else {
	                		System.out.println("Isento de IR");
	                	}
	                }
	                	

	             
	            }
	        
	    }    
	


