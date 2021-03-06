/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JFrame;

/**
 *
 * @author Cameron
 */
public class OrderWindow extends JFrame implements ActionListener {

    int portNumber;
    String host;

    Inventory inventory;
    TopMenu topMenu;
    DrinksMenuJPanel drinksMenu;
    SidesMenuJPanel sidesMenu;
    SandwichesMenu sandMenu;
    OrderSummary summary;
    //Choices
    String drinkChoice, sidesChoice, breadChoice, meatChoice, cheeseChoice;
	String usersOrder;
    public OrderWindow() {
        super("Order Kiosk");
        host = "localhost";
        portNumber = 5050;
        addTopMenu();

    }

    public void addTopMenu() {

        topMenu = new TopMenu();
        drinksMenu = new DrinksMenuJPanel();
        sidesMenu = new SidesMenuJPanel();
        sandMenu = new SandwichesMenu();

        summary = new OrderSummary(breadChoice, meatChoice, cheeseChoice, sidesChoice, drinkChoice);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(topMenu, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 480);
        setLocationRelativeTo(null);
        setVisible(true);

        //Listeners for the Top Menu buttons
        topMenu.drinks.addActionListener(this);
        topMenu.sides.addActionListener(this);
        topMenu.sandwiches.addActionListener(this);
        topMenu.complete.addActionListener(this);

        //Listeners for the next buttons on the menus and order summary
        drinksMenu.next.addActionListener(this);
        sidesMenu.next.addActionListener(this);
        sandMenu.next.addActionListener(this);
        summary.done.addActionListener(this);

    }

    public void showDrinksMenu() {
        topMenu.setVisible(false);
        sidesMenu.setVisible(false);
        sandMenu.setVisible(false);
        getContentPane().add(drinksMenu, "Center");
        drinksMenu.setVisible(true);
    }

    public void showSidesMenu() {
        topMenu.setVisible(false);
        drinksMenu.setVisible(false);
        sandMenu.setVisible(false);
        getContentPane().add(sidesMenu, "Center");
        sidesMenu.setVisible(true);
    }

    public void showTopMenu() {
        drinksMenu.setVisible(false);
        sidesMenu.setVisible(false);
        sandMenu.setVisible(false);
        // summary.setVisible(false);
        getContentPane().add(topMenu, "Center");
        topMenu.setVisible(true);
    }

    public void showSandwichMenu() {
        drinksMenu.setVisible(false);
        sidesMenu.setVisible(false);
        topMenu.setVisible(false);
        getContentPane().add(sandMenu, "Center");
        sandMenu.setVisible(true);
    }

    public void showOrderSummary() {
        drinksMenu.setVisible(false);
        sidesMenu.setVisible(false);
        topMenu.setVisible(false);
        sandMenu.setVisible(false);
        summary = new OrderSummary(breadChoice, meatChoice, cheeseChoice, sidesChoice, drinkChoice);
        getContentPane().add(summary, "Center");
        summary.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        //shows the appropriate panel when a button is clicked on the top menu
        if (obj == topMenu.drinks)
        {
            showDrinksMenu();
        }
        if (obj == topMenu.sides)
        {
            showSidesMenu();
        }
        if (obj == topMenu.sandwiches)
        {
            showSandwichMenu();
        }

        //shows the top menu when the next buttons are clicked
        if (obj == drinksMenu.next)
        {
            showTopMenu();
            drinkChoice = drinksMenu.drinkChoice;
            summary.uDrink = drinkChoice;
            System.out.println("You Selected: " + drinkChoice);
        }
        if (obj == sidesMenu.next)
        {
            showTopMenu();
            sidesChoice = sidesMenu.sideChoice;

        }
        if (obj == summary.done)
        {
			
            showTopMenu();
        }
        if (obj == sandMenu.next)
        {
            showTopMenu();
            breadChoice = sandMenu.breadChoice;
            meatChoice = sandMenu.meatChoice;
            cheeseChoice = sandMenu.cheeseChoice;
            summary.uBread = breadChoice;
            summary.uCheese = cheeseChoice;
            summary.uMeat = meatChoice;

            System.out.println("Sandwich made - " + sandMenu.breadChoice + ", " + meatChoice + ", " + cheeseChoice);
        }
		
		if (obj == summary.done){
			//socket.close();
		}
		
		
        //completes the order when the "Complete Order" button is pressed
        if (obj == topMenu.complete)
        {
            showOrderSummary();
			run();
        }
    }

    public void run() {
        try
        { usersOrder = breadChoice + " " + meatChoice + " " + cheeseChoice + " " + sidesChoice;
            Socket socket = new Socket(host, portNumber);
			InputStream is = new ByteArrayInputStream(usersOrder.getBytes());
           // DataInputStream input = new DataInputStream(usersOrder);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            
          
                output.writeUTF(usersOrder);
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void startCooking() {
        //  MakeOrder cheif = new MakeOrder(breadChoice, meatChoice, cheeseChoice, sidesChoice, drinkChoice);
        //  cheif = new MakeOrder(breadChoice, meatChoice, cheeseChoice, sidesChoice, drinkChoice);

    }

}
