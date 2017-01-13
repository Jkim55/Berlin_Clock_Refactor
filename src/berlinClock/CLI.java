package berlinClock;

public final class CLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time = args[0];
		
		BerlinClock berlinClock = new BerlinClock();
		
		berlinClock.setTime(time);
		
		berlinClock.display();
		
	}

}
