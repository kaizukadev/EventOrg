import java.util.ArrayList;

public class Atividade {
	String id;    //Formato: 001
	String sala;
	String hora;
	Palestra palestra;
	Palestrante palestrante;
	ArrayList<Participante> participantes;

	public Atividade(String id, String sala, String hora, Palestrante palestrante, Palestra palestra) {
	
		this.id = id;
		this.sala = sala;
		this.hora = hora;
		this.palestra = palestra;
		this.palestrante = palestrante;
		this.participantes = new ArrayList<Participante>();
	}

	public String getId() {
		return id;
	}

	public String getSala() {
		return sala;
	}

	public String getHora() {
		return hora;
	}

	public Palestra getPalestra() {
		return palestra;
	}

	public Palestrante getPalestrante() {
		return palestrante;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	@Override
	public String toString() {
		return "Atividade [id=" + id + ", sala=" + sala + ", hora=" + hora + ", palestra=" + palestra + ", palestrante="
				+ palestrante + ", participantes=" + participantes + "]\n";
	}








	
	
	
}
