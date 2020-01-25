package Negocio;

public class ConvertirBinarioAHexadecimal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenBinario) {
	 String Resultado=new String();
	 try {
		  int Exponente = 0;
		  long NumeroHexadecimal = Long.parseLong(ValorenBinario);
	      long Decimal = 0, Digito =0; 
	      while (NumeroHexadecimal != 0) {
	        Digito = NumeroHexadecimal % 10;
            Decimal = Decimal + Digito * (int) Math.pow(2, Exponente);
            Exponente++;
            NumeroHexadecimal = NumeroHexadecimal / 10;
	      }
	      Resultado = Long.toString(NumeroHexadecimal);
		}
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}