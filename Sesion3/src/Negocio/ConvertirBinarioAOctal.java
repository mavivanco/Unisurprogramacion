package Negocio;

public class ConvertirBinarioAOctal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenBinario) {
	 String Resultado=new String();
	 try {
		    long NumeroBinario = Long.parseLong(ValorenBinario);
		    int NumeroOctal = 0, NumeroDecimal = 0, i = 0;
	        while(NumeroBinario != 0)
	        {
	        	NumeroDecimal += (NumeroBinario % 10) * Math.pow(2, i);
	            ++i;
	            NumeroBinario /= 10;
	        }
	        i = 1;
	        while (NumeroDecimal != 0)
	        {
	        	NumeroOctal += (NumeroDecimal % 8) * i;
	        	NumeroDecimal /= 8;
	            i *= 10;
	        }
		    Resultado = Long.toString(NumeroOctal);		
		}
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}