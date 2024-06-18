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
			jsonData = converter(data);
		}

		// Call latest version
		paymentServiceV2.makeJSONPayment(jsonData, "JSON");

	}

	/**
	 *  data xml to json 
	 *  */
	private String converter(String xmlData) {
		String jsonData = xmlData;
		return jsonData;
	}

}
