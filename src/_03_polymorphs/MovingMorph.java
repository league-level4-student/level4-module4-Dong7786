package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;


public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
	public void update() {
		setX(getX() + 5);
		if(getX() >= 600) {
			setX(-50);
			
		}
	}

	
}
