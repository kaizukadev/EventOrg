import java.util.ArrayList;

public class Atividade {
	String id;    //Formato: 001
	String sala;
	String hora;
	String idPalestrante;
	String idPalestra;
	ArrayList<String> idParticipantes;

	public Atividade(String id, String sala, String hora, String idPalestrante, String idPalestra) {
	
		this.id = id;
		this.sala = sala;
		this.hora = hora;
		this.idPalestrante = idPalestrante;
		this.idPalestra = idPalestra;
		this.idParticipantes = new ArrayList<String>();
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



	public String getIdPalestrante() {
		return idPalestrante;
	}



	public String getIdPalestra() {
		return idPalestra;
	}



	public ArrayList<String> getIdParticipantes() {
		return idParticipantes;
	}



	@Override
	public String toString() {
		return "Atividade [id=" + id + ", sala=" + sala + ", hora=" + hora + ", idPalestrante="	+ idPalestrante
				+ ", idPalestra=" + idPalestra + ", idParticipantes=" + idParticipantes + "]\n";
	}










	
	
	
}
