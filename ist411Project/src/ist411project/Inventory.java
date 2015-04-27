/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

/**
 *
 * @author Graeson
 */
public class Inventory extends Thread {

    int white, wheat, italian, wholeGrain, ham, turkey, roastBeef, bologna, americanCheese, provalone;
    int fries, curlyFries, onionRings, salad, fruit, mozzSticks, friedPickles, yogurt;

    public Inventory() {
        white = wheat = italian = wholeGrain = ham = turkey = roastBeef = bologna = americanCheese = provalone = 100;
        fries = curlyFries = onionRings = salad = fruit = mozzSticks = friedPickles = yogurt = 100;
    }

    public void run() {
        
    }

    public void decreasePickedBread(String s) {
        if (s.equals("white"))
        {
            white--;
            System.out.println(s +" bread inventory: "+ white);
        }
        if (s.equals("wheat"))
        {
            wheat--;
        }
        if (s.equals("italian"))
        {
            italian--;
        }
        if (s.equals("wholeGrain"))
        {
            wholeGrain--;
        }
    }

    public void decreasePickedMeat(String n) {
        if (n.equals("ham"))
        {
            ham--;
        }
        if (n.equals("turkey"))
        {
            turkey--;
        }
        if (n.equals("roastBeef"))
        {
            roastBeef--;
        }
        if (n.equals("bologna"))
        {
            bologna--;
        }
    }

    public void decreasePickedCheese(String v) {
        if (v.equals("americanCheese"))
        {
            americanCheese--;
        }
        if (v.equals("provalone"))
        {
            provalone--;
        }
    }

    public void decreasePickedSide(String k) {
        if (k.equals("fries"))
        {
            fries--;
        }
        if (k.equals("curlyFries"))
        {
            curlyFries--;
        }
        if (k.equals("onionRings"))
        {
            onionRings--;
        }
        if (k.equals("salad"))
        {
            salad--;
        }

        if (k.equals("fruit"))
        {
            fruit--;
        }
        if (k.equals("mozzSticks"))
        {
            mozzSticks--;
        }
        if (k.equals("friedPickles"))
        {
            friedPickles--;
        }
        if (k.equals("yogurt"))
        {
            yogurt--;
        }
    }
}

/*
    
 public void wholeGrain() {

 }

 public void hamMeat() {

 }

 public void turkeyMeat() {

 }

 public void roastBeefMeat() {

 }

 public void bolognaMeat() {

 }

 public void americanCheese() {
 }

 public void provaloneCheese() {
 }

 public void frenchFries() {
 }

 public void curlyFries() {
 }

 public void onionRings() {
 }

 public void salad() {
 }

 public void fruit() {
 }

 public void mozzSticks() {
 }

 public void friedPickels() {
 }

 public void yogurt() {
 }

 }

 */
