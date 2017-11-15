import java.util.ArrayList;

public class Palestrante extends Pessoa{
	static int count = 0;
	static final int max = 3;
	String id;
	String curriculo;
	String telefone;
	ArrayList<String> palestras;
	
	public Palestrante(String id, String nome, String email,  String curriculo, String telefone) {
		super(nome, email);
		this.id = id;
		this.curriculo = curriculo;
		this.telefone = telefone;
		this.palestras= new ArrayList<String>();
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
