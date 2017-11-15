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
	
	
	public Evento(String id, String nome, String data) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.organizadores = new ArrayList<Organizador>();
		this.instEnsino = new ArrayList<InstEnsino>();
		this.participantes = new ArrayList<Participante>();
		this.palestrantes = new ArrayList<Palestrante>();
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


	
	
	@Override
	public String toString() {
		return "\n\nEvento [id=" + id + ", nome=" + nome + ", data=" + data + ", organizadores=" + organizadores
				+ ", instEnsino=" + instEnsino + ", participantes=" + participantes + "]";
	}


}
