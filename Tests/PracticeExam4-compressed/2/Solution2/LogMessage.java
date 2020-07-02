public class LogMessage {

	private String message;
	private String type;
	
	private boolean checkKeyword (String keyword) {
		if (
			message.indexOf(" "+keyword+" ") > -1 ||
			message.indexOf(keyword+" ") == 0 ||
			message.indexOf(" "+keyword) == message.length()-keyword.length()-1
		) {
			return true;
		} else {
			return false;
		}
	}
	
	public LogMessage (String m) {
		message = m;
		if (checkKeyword("error")) {
			type = "error";
		} else if (checkKeyword("alert")) {
			type = "alert";
		} else {
			type = "note";
		}
	}
	
	public String getMessage () {
		return message;
	}
	
	public String getType () {
		return type;
	}
	
	public static void main (String[] args) {
		String[] messages = new String[]{
			"security alert - repeated login failures",
			"disk offline alert", // changed to verify solution
			"file not found",
			"alert: read error on disk DSK1",
			"error on /dev/disk",
			"errors logged in error.txt"
		};
		for (String message : messages) {
			LogMessage lm = new LogMessage( message );
			System.out.println( lm.getMessage() + " -> " + lm.getType() );
		}
	}
	
}