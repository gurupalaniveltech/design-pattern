/**
 * 
 */
package gurupalaniveltech.learning.structural.adapter;

/**
 * PaymentServiceV1 -(Adaptee).
 * only supports xml type .
 */
public class PaymentServiceV1 implements Payment {
	public void makePayment(String data, String type) {
		if ("XML".equalsIgnoreCase(type)) {
			System.out.println("Successfully processed XML payment data ");
		} else {
			System.out.println("Error - Un supported data type - "+ type);
		}

	}
}
