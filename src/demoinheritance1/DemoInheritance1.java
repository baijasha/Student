/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoinheritance1;

import Content.GrandChild;
import Content.TheChild;
import Content.TheParent;

/**
 *
 * @author bains
 */
public class DemoInheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TheParent one = new TheParent();
        System.out.println(one.printStuff());
        
        TheChild two = new TheChild();
        System.out.println(two.printStuff());
        
        GrandChild three = new GrandChild();
        System.out.println(three.printStuff());
        
        
        
    }

}
