package application.client;

import java.io.BufferedReader;
import java.net.Socket;

public class Client {
	
	protected int serverPort = 8080;
    private String address = "127.0.0.1";
    protected Socket clientSocket = null;
    
    BufferedReader buffread;

    boolean gameExit = false;
    
}
