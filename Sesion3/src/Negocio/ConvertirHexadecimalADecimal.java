package Negocio;

public class ConvertirHexadecimalADecimal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenHexaDecimal) {
	 String Resultado=new String();
	 try {
		    String hstring = "0123456789ABCDEF";  
		    ValorenHexaDecimal = ValorenHexaDecimal.toUpperCase();  
			int NumeroDecimal = 0;  
			for (int i = 0; i < ValorenHexaDecimal.length(); i++)  
			{  
				char ch = ValorenHexaDecimal.charAt(i);  
				int n = hstring.indexOf(ch);  
				NumeroDecimal = 16*NumeroDecimal + n;  
			} 
			Resultado = Integer.toString(NumeroDecimal);
		}
		catch(Exception e) {
			Resultado = "Ocurri� un error en la conversi�n: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
