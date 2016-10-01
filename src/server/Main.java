package server;


public class Main {

	public static void main(String[] args) {
		Thread t = new Thread(new SocketServer(), "SocketServer");
		t.start();
	}

}
