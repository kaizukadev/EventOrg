public class Participante extends Pessoa{
	static int count = 0;
	static final int max = 10;
	String id;

	public Participante(String id, String nome, String email) {
		super(nome, email);
		this.id = id;
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
		String ret = "    [" + id + "] " + nome + "\t\t Email: " + email;
		return ret;
	}

}
