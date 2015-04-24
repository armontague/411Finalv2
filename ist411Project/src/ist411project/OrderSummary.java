/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Cameron
 */
public class OrderSummary extends JPanel implements ActionListener {

    JButton done;
    JLabel ordSum, orderNumber, bread, meat, cheese, side, drink, sandwichMade, sideMade, drinkMade;
    String uBread, uMeat, uCheese, uSide, uDrink;

    public OrderSummary(String breadOrdered, String meatOrdered, String cheeseOrdered, String sideOrdered, String drinkOrdered) {        
        uBread = breadOrdered;
        uMeat = meatOrdered;
        uCheese = cheeseOrdered;
        uSide = sideOrdered;
        uDrink = drinkOrdered;
        
        setLayout(null);
        setBackground(Color.YELLOW);
        double randomNumber = 1 + Math.random() * 100;
        int randomInt = (int) randomNumber;

        ordSum = new JLabel("Order Summary");
        orderNumber = new JLabel();
            orderNumber.setText("<html><u>Order Number</u>: " + Integer.toString(randomInt) + "</html>");
        bread = new JLabel(uBread);
        meat = new JLabel(uMeat);
        cheese = new JLabel(uCheese);
        side = new JLabel(uSide);
        drink = new JLabel(uDrink);
        done = new JButton("Done");
            done.addActionListener(this);
        sandwichMade = new JLabel();
            sandwichMade.setText("<html><u>Your Sandwich</u>: </html>");
        sideMade = new JLabel();
            sideMade.setText("<html><u>Your Side</u>: </html>");
        drinkMade = new JLabel();
            drinkMade.setText("<html><u>Your Drink</u>: </html>");
//------------------------------------------------------------------------------Setting Font
        Font font = ordSum.getFont();
        ordSum.setFont(font.deriveFont(Font.BOLD, 36f));
        orderNumber.setFont(font.deriveFont(Font.BOLD, 20f));
//------------------------------------------------------------------------------

        ordSum.setBounds     (250, 20, 500, 50);
        orderNumber.setBounds(75, 50, 250,100);
        
        sandwichMade.setBounds(75, 150, 105, 50);
        bread.setBounds      (200, 150, 75, 50);
        meat.setBounds       (270, 150, 75, 50);
        cheese.setBounds     (350, 150, 150, 50);
        
        sideMade.setBounds   (100, 220, 75, 50);
        side.setBounds       (200, 220, 75, 50);
        
        drinkMade.setBounds  (100, 300, 75, 50);
        drink.setBounds      (200, 300, 75, 50);
        done.setBounds       (600, 380, 110, 50);

        add(ordSum);
        add(orderNumber);
        add(bread);
        add(meat);
        add(cheese);
        add(side);
        add(drink);
        add(done);
        add(drinkMade);
        add(sandwichMade);
        add(sideMade);
    }
     public void actionPerformed(ActionEvent e) {
         Object obj = e.getSource();
         if (obj == done){
             System.exit(0);
         }
     }
}
