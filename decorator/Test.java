/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author xanthus
 */
public class Test {
    
    public  void swap(int a[]){
        a[0] = a[1];
    }

    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7};
        new Test().swap(a);
        for (int i : a) {
            System.out.print(i);
        }
    }
}
