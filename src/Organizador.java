public class Organizador {
	static int count = 0;
	static final int max = 1;
	String id;
	String nome;

	public Organizador(String id, String nome) {
		this.id = id;
		this.nome = nome;
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

	@Override
	public String toString() {
		String ret = "    [" + id + "] " + nome;
		return ret;
	}

}
