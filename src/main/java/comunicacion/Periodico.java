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
	public int palabrasTotales(int num) {
		return 0;
	}
	
	public String interpretacion() {
		return "";
	}
	
	public String toString() {
		return "";
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
