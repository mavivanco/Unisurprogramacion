package proyecto;

public class Negocio {
	
	
	//Conversion de decimal a .......
	
	public String convierteDecimalABinario (String numero) {
		String resultado=new String();
		int decimal = Integer.parseInt(numero);
		for(;decimal>0;){
			int binary = decimal%2;
			resultado = Integer.toString(binary) + resultado;
			decimal /= 2;
		}
		return resultado;
	} 
	
	public String convierteDecimalAOctal (String numero) {
		String resultado=new String();
		int decimal = Integer.parseInt(numero);
		int resto;
		char cacacteres[]={'0','1','2','3','4','5','6','7'};  
		
		while(decimal>0){  
			resto=decimal%8;   
	       resultado=cacacteres[resto]+resultado;   
	       decimal=decimal/8;  
	    }  
		return resultado;
	} 
	
	public String convierteDecimalAHexadecimal (String numero) {
		String resultado=new String();
		int decimal = Integer.parseInt(numero);
		int resto;
		char cacacteres[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
		
		while(decimal>0){  
			resto=decimal%16;   
	       resultado=cacacteres[resto]+resultado;   
	       decimal=decimal/16;  
	    }  
		
		
		return resultado;
	} 
	
	
	//Conversion de binario a ......
	
	public String convierteBinarioADecimal (String numero) {
		String resultado=new String();
		int binario = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	public String convierteBinarioAOctal (String numero) {
		String resultado=new String();
		int binario = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	public String convierteBinarioAHexadecimal (String numero) {
		String resultado=new String();
		int binario = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	
	
	//Conversion de octal a ......
	
	public String convierteOctalABinario (String numero) {
		String resultado=new String();
		int octal = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	public String convierteOctalADecimal (String numero) {
		String resultado=new String();
		int octal = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	
	public String convierteOctalAHexadecimal (String numero) {
		String resultado=new String();
		int octal = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	
	
	//Conversion de hexadecimal a ......
	
	public String convierteHexadecimalABinario (String numero) {
		String resultado=new String();
		int hexadecimal = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	
	public String convierteHexadecimalADecimal (String numero) {
		String resultado=new String();
		int hexadecimal = Integer.parseInt(numero);

		//Falta implementar.......
		
		
		return resultado;
	} 
	public String convierteHexadecimalAOctal (String numero) {
		String resultado=new String();
		int hexadecimal = Integer.parseInt(numero);
		
		//Falta implementar.......
		
		
		return resultado;
	} 
	
}
