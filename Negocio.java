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
	
	public int convierteBinarioADecimal (String numero) {
		String resultado=new String();
		//int binario = Integer.parseInt(numero);

		 int dec=Integer.parseInt(numero,2);
                 
                      System.out.print("DECIMAL: "+dec);
		
		return dec;
	} 
	public String convierteBinarioAOctal (String numero) {
		String resultado=new String();
		//int binario = Integer.parseInt(numero);

		int dec=Integer.parseInt(numero,2);
                    numero=Integer.toOctalString(dec);
                System.out.print("OCTAL: "+numero);
		
		resultado=numero;
		return resultado;
	} 
	public String convierteBinarioAHexadecimal (String numero) {
		String resultado=new String();
		//int binario = Integer.parseInt(numero);

		int dec=Integer.parseInt(numero,2);
                   numero=Integer.toHexString(dec);
                   System.out.print("HEXADECIMAL: "+numero);
		resultado=numero;
		
		return resultado;
	} 
	
	
	//Conversion de octal a ......
	
	public String convierteOctalABinario (String numero) {
		String resultado=new String();
		int octal = Integer.parseInt(numero);

		int dec=Integer.parseInt(numero,8);
                    numero=Integer.toBinaryString(dec);
                    System.out.print("BINARIO: "+numero);
		
		 resultado=numero;
		return resultado;
	} 
	public int convierteOctalADecimal (String numero) {
		//String resultado=new String();
                
		//int octal = Integer.parseInt(numero);

		 int dec=Integer.parseInt(numero,8);
                       System.out.print("DECIMAL: "+dec);
		
		
		return dec;
	} 
	
	public String convierteOctalAHexadecimal (String numero) {
		String resultado=new String();
		//int octal = Integer.parseInt(numero);

		 int dec=Integer.parseInt(numero,8);
                      numero=Integer.toHexString(dec);
                       System.out.print("HEXADECIMAL: "+numero);
		resultado=numero;
		
		return resultado;
	} 
	
	
	//Conversion de hexadecimal a ......
	
	public String convierteHexadecimalABinario (String numero) {
		String resultado=new String();
		//int hexadecimal = Integer.parseInt(numero);

		int dec=Integer.parseInt(numero,16);
                     numero=Integer.toBinaryString(dec);
                     System.out.print("BINARIO: "+numero);
		
		resultado=numero;
		return resultado;
	} 
	
	public int convierteHexadecimalADecimal (String numero) {
		String resultado=new String();
		//int hexadecimal = Integer.parseInt(numero);

		int dec=Integer.parseInt(numero,16);
                 System.out.print("DECIMAL: "+dec);
		
		
		return dec;
	} 
	public String convierteHexadecimalAOctal (String numero) {
		String resultado=new String();
		//int hexadecimal = Integer.parseInt(numero);
		
		 int dec=Integer.parseInt(numero,16);
                 numero=Integer.toOctalString(dec);
                  System.out.print("OCTAL: "+numero);
		
		resultado=numero;
		return resultado;
	} 

  

}

