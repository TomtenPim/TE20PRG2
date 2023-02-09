import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    ServerSocket server;
    Socket client1;
    Socket client2;

    PrintWriter out;
    BufferedReader in;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Failed to open serversocket.");
            e.printStackTrace();
        }
        System.out.println("Server started...");
    }

    private void acceptClient1() {
        try {
            client1 = server.accept();
        } catch (IOException e) {
            System.err.println("Failed to connect to client1");
            e.printStackTrace();
        }
        System.out.println("client1 connected...");
    }

    private void acceptClient2() {
        try {
            client2 = server.accept();
        } catch (IOException e) {
            System.err.println("Failed to connect to client2");
            e.printStackTrace();
        }
        System.out.println("client2 connected...");
    }

    private void getStreams() {
        try {
            out = new PrintWriter(client1.getOutputStream(), true);
            out = new PrintWriter(client2.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(client1.getInputStream()));
            in = new BufferedReader(new InputStreamReader(client2.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Streams ready...");
    }

    private void runProtocol() {
        Scanner tgb = new Scanner(System.in);
        System.out.println("chatting...");
        String msg = "";
        while (!msg.equals("QUIT")) {
            msg = tgb.nextLine();
            out.println("SERVER: " + msg);
        }
    }

    public static void main(String[] args) {
        Server s = new Server(4130);
        s.acceptClient1();
        s.getStreams();
        ListenerThread l = new ListenerThread(s.in, System.out);
        Thread listener = new Thread(l);
        listener.start();
        s.runProtocol();
        listener.stop();
        s.shutdown();
    }

    private void shutdown() {
        try {
            client1.close();
            client2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}