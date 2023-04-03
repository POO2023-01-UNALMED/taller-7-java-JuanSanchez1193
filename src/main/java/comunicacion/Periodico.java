package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion ) {
		super(origen,titulo,autor,paginas);
		this.fecha=fecha;
		this.primicia = primicia;
		this.interpretacion=interpretacion;
		
	}
	
	
	
	//methods 
	public int palabrasTotales(int cantPal) {
		int cantPag = this.getPaginas();
		int palTol = cantPal* cantPag;
		return palTol *10;
	}
	
	public String interpretacion() {
		String a = this.interpretacion;
		return a;
	}
	
	public String toString() {
	    StringBuilder output = new StringBuilder();
	    output.append(this.resumen()).append("\n");
	    output.append(this.fecha).append("\n");
	    output.append(this.primicia);
	    return output.toString();
	}
	
	// getters and setters 
	
	public String getFecha() {
		return this.fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return this.primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
