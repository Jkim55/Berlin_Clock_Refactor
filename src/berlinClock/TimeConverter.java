package berlinClock;

public final class TimeConverter {
	



	
	public static String ConvertTopMinutes(int minutes){
		
		int litLamps = minutes / 5;
		
		return GetLampsString(litLamps, 11, "Y");
	}

	public static String ConvertBottomMinutes(int minutes){
		
		int litLamps =  minutes%5;
		
		return GetLampsString(litLamps, 4, "Y");
	}
	
private String GetLampsString(int litLamps, int lampQuantity, String lampColor){
		
		String output = "";
		
		for(int i=0; i<litLamps; i++){
			output += lampColor;
		}
		
		for(int i=output.length(); i<lampQuantity; i++){
			output += "O";
		}
		
		return output;
	}
}
