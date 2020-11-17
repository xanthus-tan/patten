/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author xanthus
 */
//SimpleRemoteControl is Invoker(order)
public class SimpleRemoteControl {
    
// Command is waitress
    Command slot;

    public SimpleRemoteControl() {
    }
    //setCommand is takeOrder
    public void setCommand(Command command) {
        slot = command;
    }
   
    public void buttonWasPressed() {
        slot.execute();
    }
}
