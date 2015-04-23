/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Cameron
 */
public class OrderWindow extends JFrame implements ActionListener {
    
    TopMenu topMenu;
    DrinksMenuJPanel drinksMenu;
    SidesMenuJPanel sidesMenu;
    SandwichesMenu sandMenu;
    
    //Choices
    String drinkChoice, sidesChoice;
    
    public OrderWindow()   {
        super("Order Kiosk");
        addTopMenu();
    }
    
    public void addTopMenu() {
        
        topMenu = new TopMenu();
        drinksMenu = new DrinksMenuJPanel();
        sidesMenu = new SidesMenuJPanel();
        sandMenu = new SandwichesMenu();
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(topMenu,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (750, 480);
        setLocationRelativeTo(null);
        setVisible(true);
        
        //Listeners for the Top Menu buttons
        topMenu.drinks.addActionListener(this);
        topMenu.sides.addActionListener(this);
        topMenu.sandwiches.addActionListener(this);
        topMenu.complete.addActionListener(this);
        
        //Listeners for the next buttons on the menus
        drinksMenu.next.addActionListener(this);
        sidesMenu.next.addActionListener(this);
        sandMenu.next.addActionListener(this);
        
    }
    
    public void showDrinksMenu()    {
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
    
    public void showTopMenu()   {
        drinksMenu.setVisible(false);
        sidesMenu.setVisible(false);
        sandMenu.setVisible(false);
        getContentPane().add(topMenu, "Center");
        topMenu.setVisible(true);
    }
    
    public void showSandwichMenu()  {
        drinksMenu.setVisible(false);
        sidesMenu.setVisible(false);
        topMenu.setVisible(false);
        getContentPane().add(sandMenu, "Center");
        sandMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        //shows the appropriate panel when a button is clicked on the top menu
        if (obj == topMenu.drinks)      {showDrinksMenu();}
        if (obj == topMenu.sides)       {showSidesMenu();}
        if (obj == topMenu.sandwiches)  {showSandwichMenu();}
        
        //shows the top menu when the next buttons are clicked
        if (obj == drinksMenu.next)     {
            showTopMenu();
            drinkChoice = drinksMenu.drinkChoice;
            System.out.println("You Selected: " + drinkChoice);
        }
        if (obj == sidesMenu.next)      {showTopMenu();}
        if (obj == sandMenu.next)       {showTopMenu();}
        
        //completes the order when the "Complete Order" button is pressed
        if (obj == topMenu.complete)    {topMenu.setVisible(false);}
    }
    
    
    
}
