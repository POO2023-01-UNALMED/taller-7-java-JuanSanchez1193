package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	
	public Tesis(String origen,String titulo, String autor, int paginas,String idea,String[] argumentos,String conclusion,String referencias,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	//methods 
	public int palabrasTotales(int cantPal) {
		int cantPag = this.getPaginas();
		int palTol = cantPal* cantPag;
		return palTol *5;
	}
	
	public String interpretacion() {
		String a = this.interpretacion;
		return a;
	}
	
	public String toString() {
	    StringBuilder output = new StringBuilder();
	    output.append(this.resumen()).append("\n");
	    output.append(this.idea).append("\n");
	    output.append(this.argumentos.length).append("\n");
	    output.append(this.conclusion).append("\n");
	    output.append(this.referencias);
	    return output.toString();
	}
	
	//getters and setters 
	public String getIdea() {
		return this.idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] getArgumentos() {
		return this.argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return this.referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
