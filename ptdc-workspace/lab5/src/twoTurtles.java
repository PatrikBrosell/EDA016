import java.util.Random;

import se.lth.cs.ptdc.window.SimpleWindow;

public class twoTurtles {
	public static void main(String args[]) {
		SimpleWindow w = new SimpleWindow(600, 600, "FärggladaSköldisar");
		Random rand = new Random();
		ColorTurtle t1 = new ColorTurtle(w, 250, 250, java.awt.Color.RED);
		ColorTurtle t2 = new ColorTurtle(w, 350, 350, java.awt.Color.BLUE);
		int steps = 0;
		while (Math.abs(Math.sqrt(Math.pow(t1.getX() - t2.getX(), 2) + Math.pow(t1.getY() - t2.getY(), 2))) > 50) {
			t1.forward(rand.nextInt(10) + 1);
			t1.left(rand.nextInt(360) - 180);
			t2.forward(rand.nextInt(10) + 1);
			t2.left(rand.nextInt(360) - 180);
			w.delay(1);
		}
	}
}
