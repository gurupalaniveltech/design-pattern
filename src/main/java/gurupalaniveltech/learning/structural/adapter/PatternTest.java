package gurupalaniveltech.learning.structural.adapter;

public class PatternTest {

	public static void main(String[] args) throws Exception {
		LegacyBank bank = new LegacyBank();
		bank.process(new PaymentServiceV1());
		bank.process(new PaymentServiceV2());
		bank.process(new PaymentClassAdapter());
		bank.process(new PaymentObjectAdapter());
	}
}
