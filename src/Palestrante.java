import java.util.ArrayList;

public class Palestrante extends Pessoa{
	static int count = 0;
	static final int max = 3;
	String id;
	String curriculo;
	String telefone;
	ArrayList<String> idPalestras;
	
	public Palestrante(String id, String nome, String email,  String curriculo, String telefone) {
		super(nome, email);
		this.id = id;
		this.curriculo = curriculo;
		this.telefone = telefone;
		this.idPalestras= new ArrayList<String>();
		setCount(getCount() + 1);
	}

	public static void setCount(int count) {
		Palestrante.count = count;
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

	public String getCurriculo() {
		return curriculo;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		String ret = "    [" + id + "] " + nome + "  Email: " + email + "  Fone: " + telefone;
		ret += "\n          Currículo: "+ curriculo + "\n";
		ret += "\n idPalestras=" + idPalestras + "\n";
		return ret;
	}


	
	
	
}
