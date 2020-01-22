package Negocio;

public class ConvertirDecimalAHexadecimal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenDecimal) {
	 String Resultado=new String();
	 try {
		    int Decimal = Integer.parseInt(ValorenDecimal);
			int Resto;
			char Caracteres[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
			
			while(Decimal>0){  
				Resto=Decimal%16;   
				Resultado=Caracteres[Resto]+Resultado;   
		       Decimal=Decimal/16; 
		    }
	    }
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
