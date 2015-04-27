/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class SandwichesMenu extends JPanel implements ActionListener {

    JButton white, wheat, italian, wholeGrain, ham, turkey, roastBeef, bologna, americanCheese, provalone, next;
    JLabel sandwiches, meats, bread, cheese;
    String breadChoice, meatChoice, cheeseChoice;
    Inventory inventory;

    public SandwichesMenu() {
        
        meats = new JLabel("Meats");
        bread = new JLabel("Breads");
        sandwiches = new JLabel("Sandwiches");
        cheese = new JLabel("Cheeses");
        
        white = new JButton("White");
        wheat = new JButton("Wheat");
        italian = new JButton("Italian");
        wholeGrain = new JButton("Whole Grain");
        
        ham = new JButton("Ham");
        turkey = new JButton("Turkey");
        roastBeef = new JButton("Roast Beef");
        bologna = new JButton("Bologna");
        
        americanCheese = new JButton("American");
        provalone = new JButton("Provalone");
        
        next = new JButton("Next");
        
        setLayout(null);
        setBackground(Color.green);

        white.setBounds(150, 100, 110, 50);//x, y , sideways, hight
            white.addActionListener(this);
            add(white);
        wheat.setBounds(270, 100, 110, 50);
            wheat.addActionListener(this);
            add(wheat);
        italian.setBounds(390, 100, 110, 50);
            italian.addActionListener(this);
            add(italian);
        wholeGrain.setBounds(510, 100, 110, 50);
            wholeGrain.addActionListener(this);
            add(wholeGrain);
        ham.setBounds(150, 220, 110, 50);
            ham.addActionListener(this);
            add(ham);
        turkey.setBounds(270, 220, 110, 50);
            turkey.addActionListener(this);
            add(turkey);
        roastBeef.setBounds(390, 220, 110, 50);
            roastBeef.addActionListener(this);
            add(roastBeef);
        bologna.setBounds(510, 220, 110, 50);
            bologna.addActionListener(this);
           add(bologna); 
        americanCheese.setBounds(150, 340, 110, 50);
            americanCheese.addActionListener(this);
            add(americanCheese);
        provalone.setBounds(270, 340, 110, 50);
            provalone.addActionListener(this);
            add(provalone);
        next.setBounds(600, 380, 110, 50);
            add(next);
//--------------------------------------------------------------labels
        sandwiches.setBounds(50, 20, 150, 50);
        bread.setBounds(50, 100, 75, 50);
        meats.setBounds(50, 220, 75, 50);
        cheese.setBounds(50, 340, 75, 50);
//---------------------------------------------------------------

        Font font = sandwiches.getFont();
        sandwiches.setFont(font.deriveFont(Font.BOLD, 24f));
        bread.setFont(font.deriveFont(Font.BOLD, 16f));
        meats.setFont(font.deriveFont(Font.BOLD, 16f));
        cheese.setFont(font.deriveFont(Font.BOLD, 16f));

        add(meats);
        add(bread);
        add(sandwiches);
        add(cheese);   
    }

    public void breadButtonsEnabled() {
        white.setEnabled(true);
        wheat.setEnabled(true);
        italian.setEnabled(true);
        wholeGrain.setEnabled(true);
    }

    public void meatButtonsEnabled() {
        ham.setEnabled(true);
        turkey.setEnabled(true);
        roastBeef.setEnabled(true);
        bologna.setEnabled(true);
    }

    public void cheeseButtonsEnabled() {
        americanCheese.setEnabled(true);
        provalone.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == white)
        {
            breadButtonsEnabled();
            white.setEnabled(false);
            breadChoice = "white";
        }
        if (obj == wheat)
        {
            breadButtonsEnabled();
            wheat.setEnabled(false);
            breadChoice = "wheat";
        }
        if (obj == italian)
        {
            breadButtonsEnabled();
            italian.setEnabled(false);
            breadChoice = "italian";
        }
        if (obj == wholeGrain)
        {
            breadButtonsEnabled();
            wholeGrain.setEnabled(false);
            breadChoice = "wholeGrain";
        }
        if (obj == ham)
        {
            meatButtonsEnabled();
            ham.setEnabled(false);
            meatChoice = "ham";
        }
        if (obj == turkey)
        {
            meatButtonsEnabled();
            turkey.setEnabled(false);
            meatChoice = "turkey";
        }
        if (obj == roastBeef)
        {
            meatButtonsEnabled();
            roastBeef.setEnabled(false);
            meatChoice = "roastBeef";
        }
        if (obj == bologna)
        {
            meatButtonsEnabled();
            bologna.setEnabled(false);
            meatChoice = "bologna";
            
        }
        if (obj == americanCheese)
        {
            cheeseButtonsEnabled();
            americanCheese.setEnabled(false);
            cheeseChoice = "americanCheese";
        }
        if (obj == provalone)
        {
            cheeseButtonsEnabled();
            provalone.setEnabled(false);
            cheeseChoice = "provalone";
        }


    }
}
