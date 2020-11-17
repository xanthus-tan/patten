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
//RemoteControlTest is orderUp()
public class RemoteControlTest {

    public static void main(String[] args) {
        //invoker(order)
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //receiver
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        //takeOrder
        remote.setCommand(lightOn);
        //orderUp()
        remote.buttonWasPressed();

    }
}
