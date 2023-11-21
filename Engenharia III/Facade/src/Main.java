import classes.CinemaFacade;

public class Main {
	public static void main(String[] args) {
		CinemaFacade cinema = new CinemaFacade();

		System.out.println("Iniciando sessão do cinema...");
		cinema.watchMovie();

		System.out.println("Parando sessão do cinema...");
		cinema.stopMovie();
	}
}
