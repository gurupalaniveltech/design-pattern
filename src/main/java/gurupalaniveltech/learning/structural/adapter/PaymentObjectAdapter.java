/**
 * 
 */
package gurupalaniveltech.learning.structural.adapter;

/**
 * Payment (Object - Adapter)
 */
public class PaymentObjectAdapter implements Payment {

	private PaymentServiceV2 paymentServiceV2 = new PaymentServiceV2();

	public void makePayment(String data, String type)  {
		// Call existing process method to handle payment and potentially legacy data
		String jsonData = data;
		if ("XML".equalsIgnoreCase(type)) {
			jsonData = conversion(data);
		}

		// Call latest version
		paymentServiceV2.makePayment(jsonData, "JSON");

	}

	private String conversion(String xmlData) {
		String jsonData = xmlData;
		// TODO - data xml to json
		return jsonData;

	}

}
