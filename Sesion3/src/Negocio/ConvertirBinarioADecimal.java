package Negocio;

public class ConvertirBinarioADecimal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenBinario) {
	 String Resultado=new String();
	 try {
		  int Longitud = ValorenBinario.length();
		  int Exponente = Longitud - 1;
		  int NumeroDecimal=0;
		  for(int i = 0;i < Longitud;i++){
		   if(ValorenBinario.charAt(i) == '1'){
			   NumeroDecimal += Math.pow(2,Exponente);
		   }
		   Exponente--;
		  }
		  Resultado = Integer.toString(NumeroDecimal);
		}
		catch(Exception e) {
			Resultado = "Ocurri� un error en la conversi�n: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
