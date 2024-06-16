/**
 * 
 */
package gurupalaniveltech.learning.structural.adapter;

/**
 * LegacyBank (Client)
 */
public class LegacyBank {

	private String data = "xml data";

	public void process(Payment payment) {
		System.out.println("LegacyBank make the payment in xml format");
		payment.makePayment(this.data, "XML");
	}
}
