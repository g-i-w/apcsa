import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MinimalTCPConnection {
  public static void main(String[] args) {
    try {
			Socket socket = new Socket( "10.75.1.100", 80 );
			PrintWriter transmitter = new PrintWriter(socket.getOutputStream(), true);
      Scanner receiver = new Scanner(socket.getInputStream());
      transmitter.println( "Hello!" );
      System.out.println( receiver.nextLine() );
      socket.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
