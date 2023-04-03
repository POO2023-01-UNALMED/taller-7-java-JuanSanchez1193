package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;

	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
			String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	
	//methods 
	public int palabrasTotales(int cantPal) {
		int cantPag = this.getPaginas();
		int palTol = cantPal* cantPag;
		return palTol *2;
	}
	
	public String interpretacion() {
		String a = this.interpretacion;
		return a;
	}
	
	public String toString() {
	    StringBuilder output = new StringBuilder();
	    output.append(this.resumen()).append("\n");
	    output.append(this.co_autor).append("\n");
	    output.append(this.editorial).append("\n");
	    output.append(this.edicion);
	    return output.toString();
	}
	
	
//getters and setters 
	public String getCo_autor() {
		return this.co_autor;
	}

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return this.edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}