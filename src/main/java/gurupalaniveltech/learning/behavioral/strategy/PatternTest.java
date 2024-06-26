package gurupalaniveltech.learning.behavioral.strategy;

public class PatternTest {

	public static void main(String[] args) throws Exception {
		TripContext trip = new TripContext();
		// few holiday only so execute the short term trip 
		trip.setTripStrategy(new ShortTripStrategy());		
		trip.executeMyTrip();
		
		// long holiday - execute the Long term trip 
		trip.setTripStrategy(new LongTripStrategy());		
		trip.executeMyTrip();
	}
}
