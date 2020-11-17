/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author xanthus
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Espresso";
    }

    public double cost() {
        return 2.99;
    }
}
