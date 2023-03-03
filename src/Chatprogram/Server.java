
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
            clientCount++;
        } catch (IOException e) {
            System.err.println("Failed to connect to client");
            e.printStackTrace();
        }
        System.out.println("client connected...");
        clientCount++;
    }

    private void getStreams() {
        try {
            for(int i = 0; i < 10; i++){
                try{
                    out = new PrintWriter(client[i].getOutputStream(), true);
                    in = new BufferedReader(new InputStreamReader(client[i].getInputStream()));
                }
                catch (NullPointerException exception){

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Streams ready...");
    }

    /*private void runProtocol() {
        Scanner tgb = new Scanner(System.in);
        System.out.println("chatting...");
        String msg = "";
        while (!msg.equals("QUIT")) {
            msg = tgb.nextLine();
            out.println("SERVER: " + msg);
        }
    }*/

    public static void main(String[] args) throws InterruptedException {
        Server s = new Server(413);
        int clientCount = 0;
        s.acceptClient();
        s.getStreams();
        ListenerThread l = new ListenerThread(s.in, System.out);
        Thread listener = new Thread(l);
        listener.start();
        //s.runProtocol();
        listener.join();
        s.shutdown();
    }

    private void shutdown() {
        try {
            for(int i = 0; i < 10; i++) {
                client[i].close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
