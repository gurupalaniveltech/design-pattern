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
			jsonData = converter(data);
		}
		
		// Call latest version
		super.makeJSONPayment(jsonData, "JSON");

	}

	/**
	 *  data xml to json 
	 *  */
	private String converter(String xmlData) {
		String jsonData = xmlData;
		return jsonData;
	}


}
