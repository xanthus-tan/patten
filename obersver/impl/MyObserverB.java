/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obersver.impl;

import obersver.DisplayElement;
import obersver.Observer;

/**
 *
 * @author xanthus
 */
public class MyObserverB implements Observer, DisplayElement {
    
    private MySubject mySubject;
    private float data;
    
    public MyObserverB(MySubject mySubject) {
        this.mySubject = mySubject;
        mySubject.registerObserver(this);
    }
    
    @Override
    public void update(float data) {
        this.data = data;
        display();
    }
    
    @Override
    public void display() {
        System.out.println("Current conditions: " + data);
    }
    
}
