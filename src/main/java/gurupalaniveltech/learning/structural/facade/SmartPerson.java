package gurupalaniveltech.learning.structural.facade;
/**
 * SmartPerson(Client).
 */
public class SmartPerson {
	private SmartHomeSystem homeSystem = new SmartHomeSystem();
	
	public void myMovieSetup() {
		homeSystem.movieNightSetup();
	}
}
