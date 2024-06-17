package oops_Abstract_BankingSystem;



//abstract class for GAme
public abstract class Game {
	private String title;
	private int year;

	// constrator
	public Game(String title, int year) {
		this.title = title;
		this.year = year;
		System.out.println("Constructor Game Class");
	}

	// abstract method
	abstract void start();

	// simple method
	void displayInfo() {
		System.out.println("title: " + title);
		System.out.println("year: " + year);
	}

	// simple static method
	public static String getTotalGameDevp() {
//		System.out.println("1000");
		return "1000";
	}

	public final void gameover() {
		System.out.println("Game Over");
	}
}

class Sportgame extends Game {
	public Sportgame(String title, int year) {
		super(title, year);
		System.out.println("Constructor Sportgame");
	}

	@Override
	void start() {
		System.out.println("Start Sport Game");
	}
}

class Puzzal extends Game {
	Puzzal(String title, int year) {
		super(title, year);
		System.out.println("Constructor Puzzal");
	}

	@Override
	void start() {
		System.out.println("Start Puzzal Game");
	}
}

 class Main 
{
	public static void main(String[] args) 
	{
		Game g = new Sportgame("Cricket", 1997);
		g.start();
		g.gameover();
		g.displayInfo();
		Game.getTotalGameDevp();
		Game p = new Puzzal("feff", 25);
		p.start();
		p.gameover();
		p.displayInfo();
		Game.getTotalGameDevp();

	}

}

