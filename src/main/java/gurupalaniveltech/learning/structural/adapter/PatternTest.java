package gurupalaniveltech.learning.structural.adapter;

public class PatternTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LegacyBank bank =  new LegacyBank();
		
		bank.process(new PaymentServiceV1());
		
		try {
			bank.process(new PaymentServiceV2());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		bank.process(new PaymentClassAdapter());
		
		bank.process(new PaymentObjectAdapter());
	}

}
