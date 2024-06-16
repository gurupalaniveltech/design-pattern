/**
 * 
 */
package gurupalaniveltech.learning.structural.adapter;

/**
 * PaymentServiceV2
 */
public class PaymentServiceV2 implements Payment{
	public void makePayment(String data, String type)  {
		if ("JSON".equalsIgnoreCase(type)) {
			System.out.println("Processing json payment Data ");
		} else {
			System.out.println("Error - Un supported data type - "+ type);
		}
	}
}
