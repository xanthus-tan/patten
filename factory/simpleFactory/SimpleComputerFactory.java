/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.simpleFactory;

import factory.Computer;

/**
 *
 * @author xanthus
 */
public class SimpleComputerFactory {

    public Computer createComputer(String type) {
        Computer computer = null;
        if (type.equals("DELL")) {
            computer = new DELLComputer();
        } else if (type.equals("HP")) {
            computer = new HPComputer();
        } else if (type.equals("HUAWEI")) {
            computer = new HUAWEIComputer();
        }
        return computer;
    }
}
