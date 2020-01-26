package Objetos;

import Negocio.ConversionEstrategias;

public class Expresion {
	
	private String expresionAConvertir = "";

	public String getExpresionAConvertir() {
		return expresionAConvertir;
	}

	public void setExpresionAConvertir(String expresionAConvertir) {
		this.expresionAConvertir = expresionAConvertir;
	}
	
	public void procesoConvertir(ConversionEstrategias estrategia) {
		estrategia.Convertir(this.expresionAConvertir);
	}

}
