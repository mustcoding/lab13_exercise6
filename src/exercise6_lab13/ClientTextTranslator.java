package exercise6_lab13;

import java.util.Scanner;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClientTextTranslator {

	public static void main(String[] args) {
		
		String text = "Terima Kasih";
		System.out.println("\n Text to convert : "+text);
		
		System.out.println("convert to language : ");
		System.out.println("1. English   2. Bahasa Malaysia  3. Arabic  4. Korean(Hangul)");
		System.out.print("\nEnter the number corresponding to the language: ");
		
		//Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		
		// Read from user input
		int translateTo = scanner.nextInt();
		
		
		try {
			
		// Connect to the server @ localhost, port 2345
		Socket socket = new Socket(InetAddress.getLocalHost(), 2345);

		// Update the status of the connection
		System.out.println(socket.isConnected());

		// Write text for server
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
		
		// send text
		printWriter.println(text);
		printWriter.println(translateTo);
		System.out.println("text send to server");
		
		// Read from network
		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(socket.getInputStream()));
	
		// Close everything
		bufferedReader.close();
		socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}


