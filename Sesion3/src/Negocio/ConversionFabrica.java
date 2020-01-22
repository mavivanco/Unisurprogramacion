package Negocio;

public  class ConversionFabrica {

	public static ConversionEstrategias CrearConversion(int Conversion) {
		
		Conversiones OpcionSeleccionada = Conversiones.ObtenerPorId(Conversion);
		
		switch(OpcionSeleccionada) {
		
			case DecimalABinario: return new ConvertirDecimalABinario();
			case BinarioADecimal: return new ConvertirBinarioADecimal();
			case DecimalAOctal: return new ConvertirDecimalAOctal();
			case OctalADecimal: return new ConvertirOctalADecimal();
			case DecimalAHexadecimal: return new ConvertirDecimalAHexadecimal();
			case HexadecimalADecimal: return new ConvertirHexadecimalADecimal();
			case BinarioAOctal: return new ConvertirBinarioAOctal();
			case OctalABinario: return new ConvertirOctalABinario();
			case BinarioAHexadecimal: return new ConvertirBinarioAHexadecimal();
			case HexadecimalABinario: return new ConvertirHexadecimalABinario();	
			
			default: 	return new ConvertirDefault();
		}
	}	
}
