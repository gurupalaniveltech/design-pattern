/**
 * 
 */
package gurupalaniveltech.learning.structural.proxy;

/**
 * PaymentGateway (ProxySubject)
 */
public class PaymentGateway implements Payment {

	private PaymentService paymentService = new PaymentService();

	public void makePayment(String data) {
		additionCheck();
		paymentService.makePayment(data);
		additionLogs();
	}

	private void additionCheck() {
		System.out.println("Check the user is authenticated");
	}

	private void additionLogs() {
		System.out.println("Capturing the payment detail");
	}
}
