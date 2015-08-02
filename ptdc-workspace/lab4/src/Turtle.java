import se.lth.cs.ptdc.window.SimpleWindow;

public class Turtle {
	protected SimpleWindow w;
	public double y;
	public double x;
	public double deg;
	public boolean pen;
	
	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x,y med pennan lyft och huvudet pekande rakt uppåt
	 * i fönstret (i negativ y-riktning)
	 */
	public Turtle(SimpleWindow w, int x, int y) {
		this.w = w;
		this.x = x;
		this.y = y;
		deg = 90;
		w.moveTo(x, y);
		pen = false;
			}
	
		/** Sänker pennan */
	public void penDown() {
		pen = true;
	}
	
	/** Lyfter pennan */
	public void penUp() {
		pen = false;
	}
	
	/** Går rakt framåt n pixlar i den riktning som huvudet pekar */
	public void forward(int n) {
		w.moveTo(getX(), getY());
		this.x = x + n * Math.cos(Math.toRadians(deg));
		this.y = y - n * Math.sin(Math.toRadians(deg));
		if(pen = true){			
		w.lineTo((int) Math.round(this.x), (int) Math.round(this.y));
		}
		else {
		w.moveTo((int) Math.round(this.x), (int) Math.round(this.y));
		}
	}
	
	/** Vrider beta grader åt vänster runt pennan */
	public void left(int beta) {
		this.deg = deg + beta;
	}
	
	/** Går till punkten newX,newY utan att rita. Pennans läge (sänkt 
	    eller lyft) och huvudets riktning påverkas inte */
	public void jumpTo(int newX, int newY) {
		w.moveTo(newX,  newY);
		x = newX;
		y = newY;
	}
	
	/** Återställer huvudriktningen till den ursprungliga */
	public void turnNorth() {
		deg = 90;
	}
	
	/** Tar reda på x-koordinaten för sköldpaddans aktuella position */
	public int getX() {
		return (int)x;
	}
	
	/** Tar reda på y-koordinaten för sköldpaddans aktuella position */
	public int getY() {
		return (int)y;
	}
	
	/** Tar reda på sköldpaddans riktning, i grader från positiv x-led */
	public int getDirection() {
		return (int)deg;
	}
}
