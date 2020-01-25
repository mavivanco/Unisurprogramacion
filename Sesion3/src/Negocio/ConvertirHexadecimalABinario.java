package Negocio;

public class ConvertirHexadecimalABinario implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenHexadecimal) {
	 String Resultado=new String();
	 try {
		    ConvertirHexadecimalADecimal HaxadecimalADecimal = new ConvertirHexadecimalADecimal();
		    ConvertirDecimalABinario DecimalABinario = new ConvertirDecimalABinario();
		    
		    String NumeroDecimal = HaxadecimalADecimal.Convertir(ValorenHexadecimal);
		    
		    return DecimalABinario.Convertir(NumeroDecimal);
		    
	    }
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
