/**
 * 
 */
package gurupalaniveltech.learning.structural.decorator;

/**
 * BaseCarServiceDecorator.
 */
public abstract class BaseCarServiceDecorator implements ICarService {
	public ICarService carService; // wrapped component

	public BaseCarServiceDecorator(ICarService carService) {
		this.carService = carService;
	}

	public void service() {
		this.carService.service();
	}
}