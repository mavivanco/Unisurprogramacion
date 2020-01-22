package Negocio;

public enum Conversiones {

	DecimalABinario("Decimal a Binario",1),
	BinarioADecimal("Binario a Decimal",2),
	DecimalAOctal("Decimal a Octal",3),
	OctalADecimal("Octal a Decimal",4),
	DecimalAHexadecimal("Decimal a Hexadecimal",5),
	HexadecimalADecimal("Hexadecimal a Decimal",6),
	BinarioAOctal("Binario a Octal",7),
	OctalABinario("Octal a Binario",8),
	BinarioAHexadecimal("Binario a Hexadecimal",9),
	HexadecimalABinario("Hexadecimal a Binario",10);
	
	private String nombre;
	private int identificador;
	
	private Conversiones(String nombre, int identificador){
		this.nombre = nombre;
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public static Conversiones ObtenerPorId(int id) {
        for (Conversiones type : values()) {
            if (type.getIdentificador() == id) {
                return type;
            }
        }
        return null;
    }
	
	public static String ObtenerListadoConversiones() {
		String Lista="";
		 for (Conversiones type : values()) {
			 Lista += type.getIdentificador() + " - " + type.getNombre() + "\n";
	        }
		 return Lista;
	}
	
}
