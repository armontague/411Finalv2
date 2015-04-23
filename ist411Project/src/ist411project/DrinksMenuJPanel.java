package ist411project;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author annie
 */
public class DrinksMenuJPanel extends JPanel implements ActionListener {
    
    JButton coke, dietCoke, sprite, cherryCoke, vanillaCoke, rootBeer, orange, water, next;
    
    String drinkChoice;
    
    DrinksMenuJPanel() {
        GridLayout gridLayout = new GridLayout(2,4,50,50);
        setLayout(gridLayout);
        
        Dimension size = new Dimension(10,50);
            
        coke = new JButton("Coke");
            coke.setPreferredSize(size);
            coke.addActionListener(this);
            add(coke);
        dietCoke = new JButton("Diet Coke");
            dietCoke.setPreferredSize(size);
            dietCoke.addActionListener(this);
            add(dietCoke);
        sprite = new JButton("Sprite");
            sprite.setPreferredSize(size);
            sprite.addActionListener(this);
            add(sprite);
        cherryCoke = new JButton("Cherry Coke");
            cherryCoke.setPreferredSize(size);
            cherryCoke.addActionListener(this);
            add(cherryCoke);
        vanillaCoke = new JButton("Vanilla Coke");
            vanillaCoke.setPreferredSize(size);
            vanillaCoke.addActionListener(this);
            add(vanillaCoke);
        rootBeer = new JButton("Root Beer");
            rootBeer.setPreferredSize(size);
            rootBeer.addActionListener(this);
            add(rootBeer);
        orange = new JButton("Orange Fanta");
            orange.setPreferredSize(size);
            orange.addActionListener(this);
            add(orange);
        water = new JButton("Water");
            water.setPreferredSize(size);
            water.addActionListener(this);
            add(water);
            
        next = new JButton("Next");
            next.setPreferredSize(size);
            next.addActionListener(this);
            add(next);
    }
    
    public void buttonsEnabled()    {
        coke.setEnabled(true);
        dietCoke.setEnabled(true);
        sprite.setEnabled(true);
        cherryCoke.setEnabled(true);
        vanillaCoke.setEnabled(true);
        rootBeer.setEnabled(true);
        orange.setEnabled(true);
        water.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if (obj == coke)        {
            buttonsEnabled();
            coke.setEnabled(false);
            drinkChoice = "coke";
        }
        if (obj == dietCoke)    {
            buttonsEnabled();
            dietCoke.setEnabled(false);
            drinkChoice = "dietCoke";
        }
        if (obj == sprite)      {
            buttonsEnabled();
            sprite.setEnabled(false);
            drinkChoice = "sprite";
        }
        if (obj == cherryCoke)  {
            buttonsEnabled();
            cherryCoke.setEnabled(false);
            drinkChoice = "cherryCoke";
        }
        if (obj == vanillaCoke) {
            buttonsEnabled();
            vanillaCoke.setEnabled(false);
            drinkChoice = "vanillaCoke";
        }
        if (obj == rootBeer)    {
            buttonsEnabled();
            rootBeer.setEnabled(false);
            drinkChoice = "rootBeer";
        }
        if (obj == orange)      {
            buttonsEnabled();
            orange.setEnabled(false);
            drinkChoice = "orange";
        }
        if (obj == water)       {
            buttonsEnabled();
            water.setEnabled(false);
            drinkChoice = "water";
        }
    }
    
    
}
    

