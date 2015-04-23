/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Cameron
 */
public class TopMenu extends JPanel implements ActionListener {
    JButton sandwiches, drinks, sides, complete;
    
    OrderWindow orderWindow;
    
    public TopMenu()    {
        sandwiches = new JButton("Sandwiches");
        sandwiches.addActionListener(this);
        
        drinks = new JButton("Drinks");
        drinks.addActionListener(this);
        
        sides = new JButton("Sides");
        sides.addActionListener(this);
        
        complete = new JButton("Complete Order");
        complete.addActionListener(this);
        
        add(sandwiches);
        add(drinks);
        add(sides);
        add(complete);
        
        sandwiches.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == drinks)   {
            //orderWindow.showDrinksMenu();
        }
    }
    
}
