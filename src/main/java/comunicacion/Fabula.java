package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza =  ensenanza;
		this.interpretacion = interpretacion;
	}
	
	
	//methods
	public int palabrasTotales(int num) {
		return 0;
	}
	
	public String interpretacion() {
		return "";
	}
	
	public String toString() {
		return "";
	}
	
	//getters and setters
	public String getEnsenanza() {
		return this.ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
