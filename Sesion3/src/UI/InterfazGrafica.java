
package UI;

import Negocio.ConversionEstrategias;

import Negocio.ConversionFabrica;
import Negocio.Conversiones;
import Objetos.Expresion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterfazGrafica {

	    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    private static Expresion Conversion = new Expresion();
	    private static ConversionEstrategias strategy;
	    
	    public static void main(String[] args) throws NumberFormatException, IOException {
	    	String ContinuarProceso = "";
	        String ExpresionaConvertir ="";
	    	int MetodoSeleccionado=0;	    	
	    	do {	    	
	    			System.out.print("Seleccione un tipo de conversión:" + "\n" +  Conversiones.ObtenerListadoConversiones());
	    			MetodoSeleccionado = Integer.parseInt(reader.readLine());
	    			strategy = ConversionFabrica.CrearConversion(MetodoSeleccionado);	    			 
			        System.out.println("Proporcione el valor que desea convertir: ");
			        ExpresionaConvertir = reader.readLine();
			        Conversion.procesoConvertir(strategy);
		            System.out.println(strategy.Convertir(ExpresionaConvertir));
		            System.out.print("¿Desea realizar otra conversión? Y/N\n");
		            ContinuarProceso = reader.readLine();
		            
	    	  } while (ContinuarProceso.equalsIgnoreCase("Y"));
	    }
}