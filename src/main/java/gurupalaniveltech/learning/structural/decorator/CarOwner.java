/**
 * 
 */
package gurupalaniveltech.learning.structural.decorator;

/**
 * CarOwner (Client)
 */
public class CarOwner {


	public void service(ICarService serivce) {
				serivce.service();
	}
}
