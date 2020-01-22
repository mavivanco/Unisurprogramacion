package Negocio;

public class ConvertirDecimalABinario implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenDecimal) {
	 String Resultado=new String();
	 try {
		 int Decimal = Integer.parseInt(ValorenDecimal);
		 for(;Decimal>0;){
			 int binary = Decimal%2;
			 Resultado = Integer.toString(binary) + Resultado;
			 Decimal /= 2;
		 }
		}
		catch(Exception e) {
			Resultado = "Ocurri� un error en la conversi�n: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
