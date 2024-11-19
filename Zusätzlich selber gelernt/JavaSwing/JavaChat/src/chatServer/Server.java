package chatServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	// creo il Server e li do un nome 
	private ServerSocket serverSocket;
	// creo un costruttore 
	public Server(ServerSocket alidopami) {
		this.serverSocket = alidopami;
	}

	public void startServer() {
		try {
			while(!serverSocket.isClosed()) {
				// creo un Socket per rimanere in ascolto
				Socket socket = serverSocket.accept();
				System.out.println("A new client has connected!");
				ClientHandler clientHandler = new ClientHandler(socket);
				
				Thread thread = new Thread(clientHandler);
				thread.start();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			
		}
	}
		
		public void closeServerSocket() {
			try {
				if (serverSocket != null) {
					serverSocket.close();
					System.out.println("serverSocket closed !");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		
		
		public static void main(String[] args) throws IOException {
			int port = 1234;
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("The server is listening on port " + port);
			System.out.println("Il serverSocket e' chiuso ? " + serverSocket.isClosed());
			Server server = new Server(serverSocket);
			server.startServer();
		}
}
