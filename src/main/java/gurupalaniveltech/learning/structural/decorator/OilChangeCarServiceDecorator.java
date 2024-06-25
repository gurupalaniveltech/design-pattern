/**
 * 
 */
package gurupalaniveltech.learning.structural.decorator;

/**
 * OilChangeCarServiceDecorator.
 */
public class OilChangeCarServiceDecorator extends BaseCarServiceDecorator {

	public OilChangeCarServiceDecorator(ICarService carService) {
		super(carService);
	}

	public void service() {
		super.service();
		System.out.println(" Car oil change service done successfully");
	}
}