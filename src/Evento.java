import java.util.ArrayList;

public class Evento {
	static int count = 0;
	static int max = 1;
	String id;
	String nome;
	String data;
	ArrayList<Organizador> organizadores;
	ArrayList<InstEnsino> instEnsino;
	ArrayList<Participante> participantes;
	ArrayList<Palestrante> palestrantes;
	ArrayList<Palestra> palestras;
	ArrayList<Atividade> atividades;
	
	
	public Evento(String id, String nome, String data) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.organizadores = new ArrayList<Organizador>();
		this.instEnsino = new ArrayList<InstEnsino>();
		this.participantes = new ArrayList<Participante>();
		this.palestrantes = new ArrayList<Palestrante>();
		this.palestras = new ArrayList<Palestra>();
		this.atividades = new ArrayList<Atividade>();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getData() {
		return data;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setData(String data) {
		this.data = data;
	}


	public void mostrarEvento() {
		int ll = 80;
		System.out.print("\n\n" + Tools.repeatStr("=",ll) + "\n");
		System.out.print("EVENTO: ["+ id +"] " + nome + "\tData: " + data + "\n");
		System.out.print(Tools.repeatStr("=",ll) + "\n");
		mostrarOrganizadores(ll);
		mostrarInstEnsino(ll);
		mostrarParticipantes(ll);
		mostrarPalestrantes(ll);
		mostrarPalestras(ll);
		mostrarAtividades(ll);
		
		
		
		
		
	}


	



	private void mostrarOrganizadores(int ll) {
		System.out.println("  Organizador(es):");
		for( Organizador o : organizadores )
		{
		      System.out.print(o.toString());
		}
		System.out.print(Tools.repeatStr("-",ll) + "\n");
	}

	private void mostrarInstEnsino(int ll) {
		System.out.println("  Instituição(ões) de Ensino:");
		for( InstEnsino ie : instEnsino )
		{
		      System.out.print(ie.toString());
		}
		System.out.print(Tools.repeatStr("-",ll) + "\n");
	}

	private void mostrarParticipantes(int ll) {
		System.out.println("  Participante(s):");
		for( Participante p : participantes )
		{
		      System.out.print(p.toString());
		}
		System.out.print(Tools.repeatStr("-",ll) + "\n");
	}

	private void mostrarPalestrantes(int ll) {
		System.out.println("  Palestrante(s):");
		for( Palestrante p : palestrantes )
		{
		      System.out.print(p.toString());
		}
		System.out.print(Tools.repeatStr("-",ll) + "\n");
	}

	private void mostrarPalestras(int ll) {
		System.out.println("  Palestra(s):");
		for( Palestra p : palestras )
		{
		      System.out.print(p.toString());
		}
		System.out.print(Tools.repeatStr("-",ll) + "\n");
	}

	private void mostrarAtividades(int ll) {
		System.out.println("  Atividade(s):");
		for( Atividade a : atividades )
		{
		      System.out.print(a.toString());
		}
		System.out.print(Tools.repeatStr("-",ll) + "\n");
	}

	protected void inserirPalestrantePalestra(String idPalestrante, String idPalestra) {
		System.out.println("\n&&&&&&&&&&&\nParametros: ["+idPalestrante+"]["+idPalestra+"]\n");
		
		Palestrante p = getByIdPalestrante(idPalestrante);
		if (p != null) {
			p.idPalestras.add(idPalestra);
		}
	}

	public Palestrante getByIdPalestrante(String p_id) {
		Palestrante ret = null;
		for( Palestrante p : palestrantes ) {
			if (p.getId() == p_id)
				ret = p;
		}
		return ret;
	}
		
	public Palestra getByIdPalestra(String p_id) {
		Palestra ret = null;
		for( Palestra p : palestras ) {
			if (p.id == p_id)
				ret = p;
		}
		return ret;
	}
		
		
		
	
	@Override
	public String toString() {
		return "\n\nEvento [id=" + id + ", nome=" + nome + ", data=" + data + ", organizadores=" + organizadores
				+ ", instEnsino=" + instEnsino + ", participantes=" + participantes + "]";
	}


}
