/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _54JPanelSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class MainSwing {
    public static void main(String[] args) {
        //Swing=compoentes para seleccionar componentes, labels, textbox
        JFrame ventana = new JFrame("Mi primer ventana swing");
        ventana.setSize(300, 200);
        ventana.setVisible(true);
        //Agregar un jPanel
         JPanel jP = new JPanel();
        //Agregar un boton
         JButton jB = new JButton("Saludar");
         JButton jB1 = new JButton("Adios");
         jP.add(jB);
         jP.add(jB1);
         ventana.add(jP);
         //ventana.add(jB);
    }
}
