package Negocio;

public class ConvertirBinarioAHexadecimal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenBinario) {
	 String Resultado=new String();
	 try {
			 ConvertirBinarioADecimal BinarioADecimal = new ConvertirBinarioADecimal();
			 ConvertirDecimalAHexadecimal DecimalAHxadecimal = new ConvertirDecimalAHexadecimal();
			 
			 String NumeroDecimal = BinarioADecimal.Convertir(ValorenBinario);
			 
			 Resultado = DecimalAHxadecimal.Convertir(NumeroDecimal);
		}
		catch(Exception e) {
			Resultado = "Ocurri� un error en la conversi�n: " + e.getMessage();
		}
	 
	return Resultado;
    }
}