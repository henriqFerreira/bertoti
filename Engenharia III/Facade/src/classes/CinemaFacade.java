package classes;

public class CinemaFacade {
	private TicketSystem ticketSystem;
	private MovieSystem movieSystem;
	private SnackSystem snackSystem;

	public CinemaFacade() {
		this.ticketSystem = new TicketSystem();
		this.movieSystem = new MovieSystem();
		this.snackSystem = new SnackSystem();
	}

	public void watchMovie() {
		ticketSystem.bookTicket();
		movieSystem.playMovie();
		snackSystem.orderSnacks();
	}

	public void stopMovie() {
		movieSystem.stopMovie();
		ticketSystem.cancelTicker();
		snackSystem.cancelSnacks();
	}
}
