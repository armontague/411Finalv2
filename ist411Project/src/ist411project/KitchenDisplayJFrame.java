/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import java.io.*;
import java.net.*;
import java.net.Socket;
import javax.swing.JFrame;

/**
 * //This is where the data will be displayed in the kitchen //Recives Thread
 *
 * @author Cameron
 */
public class KitchenDisplayJFrame extends Thread {

    Inventory inventory;
    ServerSocket serverSocket;
    
    public KitchenDisplayJFrame() throws IOException {

        serverSocket = new ServerSocket(5050);
    }

    public void run() {//   ACTING AS SERVER
        try
        {
            Socket client = serverSocket.accept();
            DataInputStream input = new DataInputStream(client.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream output = new DataOutputStream(client.getOutputStream());

            while (true)
            {
                String order = input.readUTF();
                String[] arr = order.split(" ");

                inventory.decreasePickedBread(arr[0]);
                inventory.decreasePickedMeat(arr[1]);
                inventory.decreasePickedCheese(arr[2]);
                inventory.decreasePickedSide(arr[3]);

            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public static void main (String args[]){
        try{
            Thread t = new KitchenDisplayJFrame();
            t.start();
        }
        catch(IOException e){
            
        }
    }
}
/*package ist411project;

import java.io.*;
import java.net.*;
import java.net.Socket;
import javax.swing.JFrame;

/**
 * //This is where the data will be displayed in the kitchen //Recives Thread
 *
 * @author Cameron

public class KitchenDisplayJFrame extends Thread {

    Inventory inventory;
    ServerSocket serverSocket;

    public KitchenDisplayJFrame() throws IOException {

        serverSocket = new ServerSocket(5050);
    }

    public void run() {//   ACTING AS SERVER
        try
        {
            Socket client = serverSocket.accept();
            DataInputStream input = new DataInputStream(client.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream output = new DataOutputStream(client.getOutputStream());

            while (true)
            {
                String order = input.readUTF();
                String[] arr = order.split(" ");

                inventory.decreasePickedBread(arr[0]);
                inventory.decreasePickedMeat(arr[1]);
                inventory.decreasePickedCheese(arr[2]);
                inventory.decreasePickedSide(arr[3]);

            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
*/