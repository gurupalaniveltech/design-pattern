/**
 * 
 */
package gurupalaniveltech.learning.structural.decorator;

/**
 * ExtraCoatingCarServiceDecorator.
 */
public class ExtraCoatingCarServiceDecorator extends BaseCarServiceDecorator {

	public ExtraCoatingCarServiceDecorator(ICarService carService) {
		super(carService);
	}

	public void service() {
		super.service();
		System.out.println(" Car Extra Coating service done successfully");

	}
}