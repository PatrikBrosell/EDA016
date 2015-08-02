import se.lth.cs.ptdc.maze.Maze;
import se.lth.cs.ptdc.window.SimpleWindow;

public class MazeTurtle extends Turtle {
	public MazeTurtle(SimpleWindow w, int x, int y) {
		super(w, x, y);
		super.penDown();
	}

	public void walk(Maze maze) {
		super.jumpTo(maze.getXEntry(), maze.getYEntry());
		while (!maze.atExit(super.getX(), super.getY())) {
			boolean atLeftAndNotInFront = maze.wallAtLeft(super.getDirection(),super.getX(), super.getY()) && !maze.wallInFront(super.getDirection(), super.getX(),super.getY());
			boolean atLeffAndInFront = maze.wallAtLeft(super.getDirection(),super.getX(), super.getY())	&& maze.wallInFront(super.getDirection(), super.getX(),super.getY());
			boolean notAtLeftAndNotInFront = !maze.wallAtLeft(super.getDirection(), super.getX(), super.getY())	&& !maze.wallInFront(super.getDirection(), super.getX(),super.getY());
			boolean notAtLeftAndInFront = !maze.wallAtLeft(super.getDirection(), super.getX(), super.getY()) && maze.wallInFront(super.getDirection(), super.getX(),super.getY());

			if (atLeftAndNotInFront) {
				super.forward(1);
			}
			if (atLeffAndInFront) {
				super.left(-90);
				super.forward(1);
			}
			if (notAtLeftAndNotInFront) {
				super.left(90);
				super.forward(1);
			}
			if (notAtLeftAndInFront) {
				super.left(90);
				super.forward(1);
			}
			w.delay(10);
		}
		System.out.println("Sköldis tog sig ut ur den hemska labyrinten!");
	}

}