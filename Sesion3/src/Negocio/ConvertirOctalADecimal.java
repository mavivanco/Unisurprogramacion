package Negocio;

public class ConvertirOctalADecimal implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenOctal) {
	 String Resultado=new String();
	 try {
		    int NumeroOctal = Integer.parseInt(ValorenOctal);
		    int NumeroDecimal = 0;    
			int Exponente = 0;      
			while(true){    
			   if(NumeroOctal == 0){    
				break;    
			   } else {    
				int Temporal = NumeroOctal%10;    
				NumeroDecimal += Temporal*Math.pow(8, Exponente);    
				NumeroOctal = NumeroOctal/10;    
				Exponente++;    
			   }    
			}    
	        Resultado = Integer.toString(NumeroDecimal);
		}
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}