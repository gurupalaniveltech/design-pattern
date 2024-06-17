package gurupalaniveltech.learning.structural.facade;


/**
 * SmartHomeSystem(Facade).
 */
public class SmartHomeSystem {

	private SmartLight light = new SmartLight();
	private SmartWindow window = new SmartWindow();
	private SmartAC ac = new SmartAC();
	private SmartMovieSystem moviesys = new SmartMovieSystem();

	public void movieNightSetup() {
		System.out.println("Movie Night Set up flow started ");
		window.close();
		ac.on();
		moviesys.movieTVSetup();
		light.off();
		System.out.println("Movie Night Set up - Successfully ");
	}
}
