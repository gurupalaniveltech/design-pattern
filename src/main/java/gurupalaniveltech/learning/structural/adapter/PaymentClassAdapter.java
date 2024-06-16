/**
 * 
 */
package gurupalaniveltech.learning.structural.adapter;

/**
 * Payment (Class - Adapter)
 */
public class PaymentClassAdapter extends PaymentServiceV2 implements Payment {

	public void makePayment(String data, String type) {
		// Call existing process method to handle payment and potentially legacy data
		String jsonData = data;
		if ("XML".equalsIgnoreCase(type)) {
			jsonData = conversion(data);
		}
		
		// Call latest version
		super.makePayment(jsonData, "JSON");

	}

	private String conversion(String xmlData) {
		String jsonData = xmlData;
		// TODO - data xml to json
		return jsonData;

	}

}
