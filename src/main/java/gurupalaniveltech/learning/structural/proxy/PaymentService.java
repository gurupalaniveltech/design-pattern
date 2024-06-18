/**
 * 
 */
package gurupalaniveltech.learning.structural.proxy;

/**
 * PaymentService -(RealSubject).
 */
public class PaymentService implements Payment {
	public void makePayment(String data) {
		System.out.println("Successfully processed payment data ");
	}
}
