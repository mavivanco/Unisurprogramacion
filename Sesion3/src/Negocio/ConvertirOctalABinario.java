package Negocio;

public class ConvertirOctalABinario implements ConversionEstrategias {
	
 @Override
    public String Convertir(String ValorenOctal) {
	 String Resultado=new String();
	 try {
		 long i = 0; 
		   
		    while (i<ValorenOctal.length()) { 
		          
		        char c=ValorenOctal.charAt((int)i); 
		        switch (c) { 
		        case '0': 
		        	Resultado += "000"; 
		            break; 
		        case '1': 
		        	Resultado += "001"; 
		            break; 
		        case '2': 
		        	Resultado += "010"; 
		            break; 
		        case '3': 
		        	Resultado += "011"; 
		            break; 
		        case '4': 
		        	Resultado += "100"; 
		            break; 
		        case '5': 
		        	Resultado += "101"; 
		            break; 
		        case '6': 
		        	Resultado += "110"; 
		            break; 
		        case '7': 
		        	Resultado += "111"; 
		            break; 
		        default: 
		        	Resultado= "\nDigito Invalido "+ ValorenOctal.charAt((int)i); 
		            break; 
		        } 
		        i++; 
		    } 
		   
		    return Resultado; 
		}
		catch(Exception e) {
			Resultado = "Ocurrió un error en la conversión: " + e.getMessage();
		}
	 
	return Resultado;
    }
}
