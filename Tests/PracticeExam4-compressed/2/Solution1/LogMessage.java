public class LogMessage {

	private String message;
	private String type;
	
	public LogMessage (String m) {
		message = m;
		if (
			message.indexOf(" error ") > -1 ||
			message.indexOf("error ") == 0 ||
			message.indexOf(" error") == message.length()-6
		) {
			type = "error";
		} else if (
			message.indexOf(" alert ") > -1 ||
			message.indexOf("alert ") == 0 ||
			message.indexOf(" alert") == message.length()-6
		) {
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
			"disk offline",
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