import java.util.ArrayList;

public class EventOrgMain {

	public static void main(String[] args) {
		Evento evento = new Evento("","","");
		String filename = "data/EventOrg.csv";
		String delimiter = "[|\n]";
		CSVParser.lerArquivo(evento,filename,delimiter);
		
		evento.mostrarEvento();
	}

}
