package server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer implements Runnable  {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("A");
		try 
		{
			ServerSocket serverSocket = new ServerSocket(602);
			Socket socket = serverSocket.accept();
			DataInputStream input = new DataInputStream(socket.getInputStream());
			
			String response;
			
			BufferedReader lines =
					new BufferedReader(new InputStreamReader(input, "UTF-8"));
			while((response = lines.readLine()) != null)
			{
				System.out.println(response);
			}
			
			System.out.println("AA");
			socket.close();
			serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
