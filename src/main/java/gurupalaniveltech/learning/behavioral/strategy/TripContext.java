package gurupalaniveltech.learning.behavioral.strategy;

public class TripContext {

	private TripStrategy tripStrategy;

	public void setTripStrategy(TripStrategy tripStrategy) {
		this.tripStrategy = tripStrategy;
	}

	public void executeMyTrip() {
		tripStrategy.travel();
	}

}
