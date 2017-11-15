import java.util.ArrayList;

public class Atividade {
	String id;    //Formato: 001
	String sala;
	String hora;
	Palestra palestra;
	Palestrante palestrante;
	ArrayList<Participante> participantes;








	public Atividade(String id, String sala, String hora, Palestra palestra, Palestrante palestrante) {
	
		this.id = id;
		this.sala = sala;
		this.hora = hora;
		this.palestra = palestra;
		this.palestrante = palestrante;
		this.participantes = new ArrayList<Participante>();
	}








	
	
	
}
