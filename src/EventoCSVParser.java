import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class EventoCSVParser {


	public static void lerArquivo(Evento evt, String filename, String delimiter) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(filename));
			sc.useDelimiter(delimiter);
		} catch (FileNotFoundException e) {
        	Tools.errormsg(e,true);
		}
		
		while (sc.hasNext()) {
			String op = sc.next();
			switch( op )
			{
			    case "01":
			    	definirEvento(evt,sc);
		            break;
			    case "02":
			    	incluirOrganizador(evt,sc);
		            break;
			    case "03":
			    	incluirInstEnsino(evt,sc);
		            break;
			    case "04":
			    	incluirParticipante(evt,sc);
		            break;
			    case "05":
			    	incluirPalestrante(evt,sc);
		            break;
			    
			    default:
			            Tools.msg("Tipo de registro inválido! Registro será desconsiderado.");
			}			
		}
		
		sc.close();
	}

	public static void definirEvento(Evento evt, Scanner sc) {
		evt.setId(sc.next());
		evt.setData(sc.next());
		evt.setNome(sc.next());
	}
	
	public static void incluirOrganizador(Evento evt, Scanner sc) {
		if (Organizador.count < Organizador.max)
			evt.organizadores.add(new Organizador(sc.next(),sc.next()));
		else
			Tools.msg(Tools.MSG_01);
	}

	private static void incluirInstEnsino(Evento evt, Scanner sc) {
		if (InstEnsino.getCount() < InstEnsino.getMax())
			evt.instEnsino.add(new InstEnsino(sc.next(),sc.next()));
		else
			Tools.msg(Tools.MSG_01);
	}

	private static void incluirParticipante(Evento evt, Scanner sc) {
		if (Participante.getCount() < Participante.getMax())
			evt.participantes.add(new Participante(sc.next(),sc.next(),sc.next()));
		else
			Tools.msg(Tools.MSG_01);
	}

	private static void incluirPalestrante(Evento evt, Scanner sc) {
		if (Palestrante.getCount() < Palestrante.getMax())
			evt.palestrantes.add(new Palestrante(sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
		else
			Tools.msg(Tools.MSG_01);
	}

}
