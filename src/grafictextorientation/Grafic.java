/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafictextorientation;

import javax.swing.JFrame;

/**
 *
 * @author Scare
 */
public class Grafic extends JFrame{
    String text;
    public enum orientationOptions {Horizontal,Vertical,Diagonal_P,Diagonal_S};
    
    public Grafic(String t, orientationOptions o){
        super("alinhamentos");
    }
}
