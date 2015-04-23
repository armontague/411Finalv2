/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SandwichesMenu extends JPanel implements ActionListener {

    JButton white;
    JButton wheat;
    JButton italian;
    JButton wholeGrain;
    JButton ham;
    JButton turkey;
    JButton roastBeef;
    JButton bologna;
    JButton americanCheese;
    JButton provalone;
    JButton next;
    JLabel sandwiches;
    JLabel meats;
    JLabel bread;
    JLabel cheese;

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

        white.setBounds(150, 100, 110, 50);//X, y , sideways, hight
        wheat.setBounds(270, 100, 110, 50);
        italian.setBounds(390, 100, 110, 50);
        wholeGrain.setBounds(510, 100, 110, 50);

        ham.setBounds(150, 220, 110, 50);
        turkey.setBounds(270, 220, 110, 50);
        roastBeef.setBounds(390, 220, 110, 50);
        bologna.setBounds(510, 220, 110, 50);

        americanCheese.setBounds(150, 340, 110, 50);
        provalone.setBounds(270, 340, 110, 50);

        next.setBounds(600, 400, 110, 50);

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
        

        add(white);
        add(wheat);
        add(italian);
        add(wholeGrain);

        add(ham);
        add(turkey);
        add(roastBeef);
        add(bologna);

        add(americanCheese);
        add(provalone);

        add(meats);
        add(bread);
        add(sandwiches);
        add(cheese);

        add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
