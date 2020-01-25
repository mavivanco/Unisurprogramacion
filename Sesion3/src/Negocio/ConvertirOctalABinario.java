package Negocio;

public class ConvertirOctalABinario implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenOctal) {
	 String Resultado=new String();
	 try {
		    int binnum, rem, quot, i=1, j;
		    int octnum[] = new int[100];
		    quot = Integer.parseInt(ValorenOctal);
		    while(quot != 0)
	        {
	            octnum[i++] = quot%8;
	            quot = quot/8;
	        }
	        for(j=i-1; j>0; j--)
	        {
	            Resultado += octnum[j];
	        }
		}
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
