package gurupalaniveltech.learning.structural.proxy;

public class PatternTest {

	public static void main(String[] args) throws Exception {
		LegacyBank bank = new LegacyBank();
		bank.process(new PaymentService());
		
		bank.process(new PaymentGateway());
	}
}
