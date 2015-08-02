import java.util.Scanner;
import se.lth.cs.ptdc.maze.Maze;
import se.lth.cs.ptdc.window.SimpleWindow;

public class MazeTest {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Sköldpaddans helvete");
		MazeTurtle turtle = new MazeTurtle(w, 1, 1);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vilken labyrint (1-5) vill du sätta sköldpaddsstackaren i nu då?");
		int bana = scanner.nextInt();
		Maze maze = new Maze(bana);
		maze.draw(w);
		turtle.walk(maze);
	}
}
