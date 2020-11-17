/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obersver.impl;

import obersver.DisplayElement;
import obersver.Observer;
import obersver.Subject;

/**
 *
 * @author xanthus
 */
public class MyObserverA implements Observer, DisplayElement {
    
    private final Subject mySubject;
    private float data;
    
    public MyObserverA(Subject mySubject) {
        this.mySubject = mySubject;
        mySubject.registerObserver(this);
    }
    
    @Override
    public void update(float data) {
        this.data = data;
        //mySubject.measurementsChanged();
        display();
    }
    
    @Override
    public void display() {
        System.out.println("current conditions: " + this.data);
    }
    
}
