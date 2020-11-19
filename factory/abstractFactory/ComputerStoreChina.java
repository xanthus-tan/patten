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
public abstract class ComputerStoreChina extends ComputerStore {

    @Override
    protected Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "HP":
                computer = new HPComputerChina();
                break;
            case "HUAWEI":
                computer = new HUAWEIComputerChina();
                break;
            case "DELL":
                computer = new DELLComputerChina();
                break;
            default:
                break;
        }
        return computer;
    }
}
