package com.jacob.chat.server;

public class ServerMain {
	

	private Server server;
	

	public ServerMain(int port){
		
		server = new Server(port);
	}

	public static void main(String[] args) {
		int port;
		if (args.length != 1) {
			System.out.println("Usage: java -jar  Chat.jar [port]");
			return;
		}
		port = Integer.parseInt(args[0]);
		new ServerMain(port);
	}
}
