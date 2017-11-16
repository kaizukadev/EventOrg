
public class Palestra {
	static int count = 0;
	static final int max = 4;
	String id;
	String nome;
	String resumo;

	public Palestra(String id, String nome, String resumo) {
		this.id = id;
		this.nome = nome;
		this.resumo = resumo;
		setCount(getCount() + 1);
	}

	public static void setCount(int count) {
		Organizador.count = count;
	}
	
	public static int getCount() {
		return count;
	}

	public static int getMax() {
		return max;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getResumo() {
		return nome;
	}

	@Override
	public String toString() {
		String ret = "    [" + id + "] " + nome;
		ret += "\n          Resumo: "+ resumo + "\n";
		return ret;
	}


}