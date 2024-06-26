package gurupalaniveltech.learning.structural.decorator;

public class PatternTest {

	public static void main(String[] args) throws Exception {
		CarOwner bank = new CarOwner();
		// bank.service(new CarService());	
		
		bank.service(new OilChangeCarServiceDecorator(new ExtraCoatingCarServiceDecorator(new CarService())));
	}
}
