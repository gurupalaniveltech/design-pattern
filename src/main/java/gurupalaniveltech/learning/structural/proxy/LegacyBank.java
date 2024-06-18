/**
 * 
 */
package gurupalaniveltech.learning.structural.proxy;

/**
 * LegacyBank (Client)
 */
public class LegacyBank {

	private String data = "payment data";

	public void process(Payment payment) {
		System.out.println("LegacyBank make the payment ");
		payment.makePayment(this.data);
	}
}
