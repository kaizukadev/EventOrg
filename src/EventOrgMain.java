public class EventOrgMain {

	public static void main(String[] args) {
		Evento evento = new Evento("","","");
		String filename = "data/EventOrg.csv";
		String delimiter = "[|\n]";
		EventoCSVParser.lerArquivo(evento,filename,delimiter);
		
		evento.mostrarEvento();
		
//		System.out.println( "\n\n+++++++++++++++++++++\n"+evento.getByIdPalestra("002"));

	}

}
