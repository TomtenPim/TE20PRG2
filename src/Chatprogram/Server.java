
package Chatprogram;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    ServerSocket server;
    Socket[] client = new Socket[10];

    PrintWriter out;
    BufferedReader in;

    int clientCount = 0;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Failed to open serversocket.");
            e.printStackTrace();
        }
        System.out.println("Server started...");
    }

    private void acceptClient() {
        try {
            client[clientCount] = server.accept();
        } catch (IOException e) {
            System.err.println("Failed to connect to client");
            e.printStackTrace();
        }
        System.out.println("client connected...");
        clientCount++;
    }
}
