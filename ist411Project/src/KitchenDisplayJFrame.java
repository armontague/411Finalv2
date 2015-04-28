/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
	String[] arr = new String[4];
	String[] userBought = new String[4];	
    public KitchenDisplayJFrame() throws IOException {
		inventory = new Inventory();
                inventory.getInventory();
        serverSocket = new ServerSocket(5050);
    }

    public void run() {//   ACTING AS SERVER
			System.out.println("In the run method");
	   try
        {
		System.out.println("In the try block");
            Socket client = serverSocket.accept();
            DataInputStream input = new DataInputStream(client.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream output = new DataOutputStream(client.getOutputStream());


            
			int i = 0;
                String order = input.readUTF();
                arr = order.split(" ");
				 for ( String ss : arr) {
					userBought[i] = ss;
					i++;
				} 
		inventory.decreasePickedBread(userBought[0]);
                inventory.decreasePickedMeat(userBought[1]);
                inventory.decreasePickedCheese(userBought[2]);
                inventory.decreasePickedSide(userBought[3]);
                inventory.setInventory();

            

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
