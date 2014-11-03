import java.awt.Point;
import java.awt.image.BufferedImage;


public class Background extends DualCoordinateImage {
	
	Background(BufferedImage image, int initialX, int initialY) {
		super(image, initialX, initialY);
	}
	
	public void move() {
		y -= TunableParameters.BackgroundSpeed;
		if(y < -image.getHeight())
			y = 0;
	}
}
