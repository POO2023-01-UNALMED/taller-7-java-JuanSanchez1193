package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	//constructor
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	//methods
	public int cantidadLetras() {
		int cantLet = this.letras.length;
		return cantLet;
	}
	
	public String interpretacion() {
		String a = this.interpretacion;
		return a;
	}
	
	public String toString() {
	    StringBuilder output = new StringBuilder();
	    for (int i = 0; i < this.letras.length; i++) {
	        if (i > 0) {
	            output.append(", ");
	        }
	        output.append(this.letras[i]);
	    }
	    return output.toString();
	}
	
	
	// getters and setters 
	public String[] getLetras() {
		return this.letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	
	

	
	
}

