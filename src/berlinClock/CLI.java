package berlinClock;

public final class CLI {

	public static void main(String[] args) {
		
		String time = args[0];
		
		BerlinClock berlinClock = new BerlinClock();
		
		berlinClock.setTime(time);
		
		berlinClock.display();
		
	}

}
