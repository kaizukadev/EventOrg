
public class Palestra {
	String titulo;
	String resumo;
	
	public Palestra(String titulo, String resumo) {
		this.titulo = titulo;
		this.resumo = resumo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getResumo() {
		return resumo;
	}

	@Override
	public String toString() {
		return "Palestra [titulo=" + titulo + ", resumo=" + resumo + "]";
	}

}