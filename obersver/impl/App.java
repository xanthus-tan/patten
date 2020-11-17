/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obersver.impl;

public class App {

    public static void main(String[] args) {
        MySubject mysubject = new MySubject();

        MyObserverA da1 = new MyObserverA(mysubject);
        MyObserverB da2 = new MyObserverB(mysubject);
        MyObserverC da3 = new MyObserverC(mysubject);

        mysubject.setData(30f);

    }

}
