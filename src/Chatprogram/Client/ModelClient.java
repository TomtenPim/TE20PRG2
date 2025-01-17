package Chatprogram.Client;

import Chatprogram.ListenerThread;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ModelClient {
    Socket socket;
    String name;
    PrintWriter out;
    BufferedReader in;
    String msg = "";

    public ModelClient(String ip, int port, String name){
        try {
            socket = new Socket(ip,port);
        } catch (IOException e) {
            System.err.println("Failed to connect to server");
            e.printStackTrace();
        }
        System.out.println("Connection ready...");
        this.name = name;
    }

    public void getStreams() {
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Streams ready...");
    }

    private void runProtocol() {
        Scanner tgb = new Scanner(System.in);
        System.out.println("chatting...");
        while (!msg.equals("QUIT")) {
            msg = tgb.nextLine();
            out.println(name +": " + msg);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ModelClient me = new ModelClient("10.80.45.132", 413, "Coolkid");
        me.getStreams();
        ListenerThread l = new ListenerThread(me.in, System.out);
        Thread listener = new Thread(l);
        listener.start();
        me.runProtocol();
        listener.join();
        me.shutDown();
    }

    public void setMessage(String text){
        this.msg = text;
    }

    private void shutDown() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



