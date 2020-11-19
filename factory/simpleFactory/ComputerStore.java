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
public class ComputerStore {

    SimpleComputerFactory factory;

    public ComputerStore(SimpleComputerFactory factory) {
        this.factory = factory;
    }

    public Computer orderComputer(String type) {
        Computer computer;
        computer = factory.createComputer(type);
        
        computer.mainboard();
        computer.cpu();
        computer.gpu();
        computer.monitor();
        
        return computer;
    }
}
