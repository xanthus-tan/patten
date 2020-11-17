/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obersver.impl;

import java.util.ArrayList;
import java.util.List;
import obersver.Observer;
import obersver.Subject;

public class MySubject implements Subject {

    private List<obersver.Observer> observers;
    private float data;

    public MySubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        //System.out.println(observers.size());
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }
    
    public void setData(float data){
        this.data = data;
        measurementsChanged();
    }
}
