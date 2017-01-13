package berlinClock;

public enum LampColor {
	YELLOW,
	RED,
	OFF;
	
	public String toString(){
		switch (this){
			case YELLOW: return 	"\\e[43m \\e[0m";
			case RED: return "\\e[41m \\e[0m";
			case OFF: return "\\e[47m \\e[0m";
			default: return "messed up";
		}
	}
	
}
