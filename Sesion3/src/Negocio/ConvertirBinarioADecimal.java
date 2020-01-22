package Negocio;

public class ConvertirBinarioADecimal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenDecimal) {
	 String Resultado=new String();
	 try {
		  int longitud = ValorenDecimal.length();
		  int potencia = longitud - 1;
		  int ResultadoTemporal=0;
		  for(int i = 0;i < longitud;i++){
		   if(ValorenDecimal.charAt(i) == '1'){
			   ResultadoTemporal += Math.pow(2,potencia);
		   }
		   potencia--;
		  }
		  Resultado = Integer.toString(ResultadoTemporal);
		}
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
