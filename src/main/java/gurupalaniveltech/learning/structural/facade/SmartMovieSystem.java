package gurupalaniveltech.learning.structural.facade;

/**
 * SmartMovieSystem(AdditionalFacade).
 */
public class SmartMovieSystem {
	private SmartTV tv = new SmartTV();
	private SmartSpeaker speaker = new SmartSpeaker();
	
	public void movieTVSetup() {
		System.out.println("Movie TV Set up flow started ");
		tv.on();
		speaker.highVolume();
		tv.playmovie();
		System.out.println("Movie TV Set up - Successfully ");
	}
}
