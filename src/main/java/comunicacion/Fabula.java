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
	public int palabrasTotales(int cantPal) {
		int cantPag = this.getPaginas();
		int palTol = cantPal* cantPag;
		return palTol;
	}
	
	public String interpretacion() {
		String a = this.interpretacion;
		return a;
	}
	
	public String toString() {
	    StringBuilder output = new StringBuilder();
	    output.append(this.resumen()).append("\n").append(this.ensenanza);
	    return output.toString();
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
