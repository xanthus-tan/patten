/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.abstractFactory;

import factory.Computer;

/**
 *
 * @author xanthus
 */
public abstract class ComputerStore {

    public Computer orderComputer(String type) {
        Computer computer;
        
        computer = createComputer(type);
        
        computer.mainboard();
        computer.cpu();
        computer.gpu();
        computer.monitor();
        
        return computer;
    }
    protected abstract Computer createComputer(String type);
}
