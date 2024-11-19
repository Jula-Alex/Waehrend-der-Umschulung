package serverClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;
	
	public void Server(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}
	
	public <ClientHandler> void startServer() {
		try {
			while(!serverSocket.isClosed()) {
				Socket socket = serverSocket.accept();
				System.out.println("A new client has connected!");
				ClientHandler clientHandler = new ClientHandler();
			}
		} finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
}
