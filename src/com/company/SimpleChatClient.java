package com.company;

import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClient {

    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    private void go() {

        JFrame frame = new JFrame( "Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);

        Thread readThread = new Thread(new IncomingReader());
        readThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNextNetWorking();
        frame.setSize(400,500);
        frame.setVisible(true);

    } // close go()

    // use socket to get input/output stream
    private void setUpNextNetWorking() {

        try{
            sock = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");

        }catch (IOException ex) {
            ex.printStackTrace();

        }
    } // close setUpNetworking

    // while user turn on send button, send text field context to server
    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            try{
                writer.println(outgoing.getText());
                writer.flush();
            }catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    } // close SendButtonListener

    // run() will continue to read message from server
    // and insert it into txt field with scroller
    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {

                while ((message = reader.readLine()) != null) {
                    System.out.println("read" + message);
                    incoming.append(message + "\n");
                }

            } catch (Exception ex) {
                ex.printStackTrace();

            }

        }
    } // close IncomingReader
}
